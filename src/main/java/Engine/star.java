package Engine;

import org.joml.Vector3f;
import org.joml.Vector4f;

import java.util.List;

import static org.lwjgl.opengl.GL15.*;
import static org.lwjgl.opengl.GL15.GL_STATIC_DRAW;
import static org.lwjgl.opengl.GL20.glEnableVertexAttribArray;
import static org.lwjgl.opengl.GL20.glVertexAttribPointer;
import static org.lwjgl.opengl.GL30.glBindVertexArray;
import static org.lwjgl.opengl.GL30.glGenVertexArrays;
public class star extends Object2d{
    List<Integer> index;
    int ibo;
    //index buffer object || element buffer object

    public star(List<ShaderModuleData> shaderModuleDataList, List<Vector3f> vertices, Vector4f color,List<Integer> index) {
        super(shaderModuleDataList, vertices, color);
        this.index = index;
        ibo = glGenBuffers();
        glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, ibo);
        glBufferData(GL_ELEMENT_ARRAY_BUFFER,
                Utils.listoInt(index),
                GL_STATIC_DRAW);

    }
    public void draw(){
        drawSetup();
        //Bind IBO & draw
        glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, ibo);
        glLineWidth(0.01f);
        glDrawElements(GL_LINES, index.size(), GL_UNSIGNED_INT, 0);
    }
}

