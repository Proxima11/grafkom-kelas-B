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

public class Circle extends Object2d{
    public Circle(List<ShaderModuleData> shaderModuleDataList, List<Vector3f> vertices, Vector4f color) {
        super(shaderModuleDataList, vertices, color);
    }
    public void createCircle(double xcenter, double ycenter, double r){
        //vertices -> clear
        for(double i = 0; i < 360; i += 0.01f){
            double x = xcenter + r*Math.cos(Math.toRadians(i));
            double y = ycenter + r*Math.sin(Math.toRadians(i));
            vertices.add(new Vector3f((float) x, (float) y,0.0f));
        }
    }
    public void createRectangle(double xcenter, double ycenter, double r){
        //vertices -> clear
//        int degree = 45;
//        for(double i = 0; i < 360; i += 0.01f){
//            x = centerpoint.x + r*cos(teta);
//            y = centerpoint.y + r*sin(teta);
//            vertices.add(new Vector3f(x,y,0.0f));
//            degree+=90;
        }
//    }
    public void createTriangle(double xcenter, double ycenter, double r){
        //vertices -> clear
//        int degree = 45;
//        for(double i = 0; i < 360; i += 0.01f){
//            x = centerpoint.x + r*cos(teta);
//            y = centerpoint.y + r*sin(teta);
//            vertices.add(new Vector3f(x,y,0.0f));
//            degree+=90;
//        }
    }
}
