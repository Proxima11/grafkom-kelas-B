import Engine.*;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL30.*;

public class Main {
    private Window window =
            new Window
                    (800,800,"Hello World");
    private ArrayList<Object2d> objects
            = new ArrayList<>();
    private ArrayList<Object2d> objectsRectangle
            = new ArrayList<>();

    public void init(){
        window.init();
        GL.createCapabilities();

        //code
//        objects.add(new Object2d(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of(
//                                new Vector3f(0.0f,0.5f,0.0f),
//                                new Vector3f(-0.5f,-0.5f,0.0f),
//                                new Vector3f(0.5f,-0.5f,0.0f)
//                        )
//                ),
//                new Vector4f(0.0f, 1.0f, 1.0f, 1.0f)
//        ));
//        objects.add(new Object2d(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/sceneWithVerticesColor.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/sceneWithVerticesColor.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of(
//                                new Vector3f(0.0f,0.5f,0.0f),
//                                new Vector3f(-0.5f,-0.5f,0.0f),
//                                new Vector3f(0.5f,-0.5f,0.0f)
//                        )
//                ),
//                new ArrayList<>(
//                        List.of(
//                                new Vector3f(1.0f,0.0f,0.0f),
//                                new Vector3f(0.0f,1.0f,0.0f),
//                                new Vector3f(0.0f,0.0f,1.0f)
//                        )
//                )
//        ));
        objectsRectangle.add(new Rectangle(
                Arrays.asList( 
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(1.0f,1.0f,0.0f),
                                new Vector3f(-1.0f,1.0f,0.0f),
                                new Vector3f(1.0f,-1.0f,0.0f),
                                new Vector3f(-1.0f,-1.0f,0.0f)
                        )
                ),
                new Vector4f(0.0f, 0.0f, 1.0f, 1.0f),
                Arrays.asList(2,1,3,0,2,1,3)
        ));
        objectsRectangle.add(new Rectangle(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(1.0f,-0.5f,0.0f),
                                new Vector3f(-1.0f,-0.5f,0.0f),
                                new Vector3f(1.0f,-1.0f,0.0f),
                                new Vector3f(-1.0f,-1.0f,0.0f)
                        )
                ),
                new Vector4f(0.0f, 1.0f, 0.0f, 1.0f),
                Arrays.asList(2,1,3,0,2,1,3)
        ));
        //atap kiri
        objectsRectangle.add(new Rectangle(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(-0.4f,0.2f,0.0f),
                                new Vector3f(-0.4f,0.2f,0.0f),
                                new Vector3f(-0.2f,-0.2f,0.0f),
                                new Vector3f(-0.6f,-0.2f,0.0f)
                        )
                ),
                new Vector4f(1.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(2,1,3,0,2,1,3)
        ));
        //kotak rumah atas
        objectsRectangle.add(new Rectangle(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(-0.35f,0.2f,0.0f),
                                new Vector3f(-0.35f,0.2f,0.0f),
                                new Vector3f(0.5f,-0.1f,0.0f),
                                new Vector3f(-0.5f,-0.1f,0.0f)
                        )
                ),
                new Vector4f(0.992f, 0.694f, 0.070f, 1.0f),
                Arrays.asList(2,1,3,0,2,1,3)
        ));
        //kotak rumah bawah
        objectsRectangle.add(new Rectangle(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(0.5f,-0.1f,0.0f),
                                new Vector3f(-0.5f,-0.1f,0.0f),
                                new Vector3f(0.5f,-0.6f,0.0f),
                                new Vector3f(-0.5f,-0.6f,0.0f)
                        )
                ),
                new Vector4f(0.992f, 0.694f, 0.070f, 1.0f),
                Arrays.asList(2,1,3,0,2,1,3)
        ));
        //atap kanan
        objectsRectangle.add(new Rectangle(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(-0.4f,0.2f,0.0f),
                                new Vector3f(0.4f,0.2f,0.0f),
                                new Vector3f(-0.2f,-0.2f,0.0f),
                                new Vector3f(0.6f,-0.2f,0.0f)
                        )
                ),
                new Vector4f(1.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(2,1,3,0,2,1,3)
        ));
        //batang cerobong
        objectsRectangle.add(new Rectangle(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(0.22f,0.25f,0.0f),
                                new Vector3f(0.3f,0.25f,0.0f),
                                new Vector3f(0.22f,0.1f,0.0f),
                                new Vector3f(0.3f,0.1f,0.0f)
                        )
                ),
                new Vector4f(0.992f, 0.694f, 0.070f, 1.0f),
                Arrays.asList(2,1,3,0,2,1,3)
        ));
        //tutup cerobong
        objectsRectangle.add(new Rectangle(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(0.2f,0.29f,0.0f),
                                new Vector3f(0.32f,0.29f,0.0f),
                                new Vector3f(0.2f,0.24f,0.0f),
                                new Vector3f(0.32f,0.24f,0.0f)
                        )
                ),
                new Vector4f(1f, 1f, 1f, 1.0f),
                Arrays.asList(2,1,3,0,2,1,3)
        ));
        //bulan
        List<Vector3f> vertices = new ArrayList<>();
        for(double i = 0; i < 360; i += 0.001f) {
            double x = -0.7f + 0.1 * Math.cos(Math.toRadians(i));
            double y = 0.6f + 0.1 * Math.sin(Math.toRadians(i));
            vertices.add(new Vector3f((float) x, (float) y, 0.0f));
        }
//        vertices.add(new Vector3f(0.0f,0.0f,0.0f));
//        vertices.add(new Vector3f(-0.5f,-0.5f,0.0f));
        objects.add(new Object2d(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                vertices,
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f)
        ));
        List<Vector3f> vertices1 = new ArrayList<>();
        for(double i = 0; i < 360; i += 0.001f) {
            double x = -0.65f + 0.1 * Math.cos(Math.toRadians(i));
            double y = 0.6f + 0.1 * Math.sin(Math.toRadians(i));
            vertices1.add(new Vector3f((float) x, (float) y, 0.0f));
        }
        objects.add(new Object2d(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                vertices1,
                new Vector4f(0.0f, 0.0f, 1.0f, 1.0f)
        ));
        //asap
        List<Vector3f> asap = new ArrayList<>();
        for(double i = 0; i < 360; i += 0.001f) {
            double x = 0.26f + 0.075 * Math.cos(Math.toRadians(i));
            double y = 0.37f + 0.05 * Math.sin(Math.toRadians(i));
            asap.add(new Vector3f((float) x, (float) y, 0.0f));
        }
        objects.add(new Object2d(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                asap,
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f)
        ));
        List<Vector3f> asap1 = new ArrayList<>();
        for(double i = 0; i < 360; i += 0.001f) {
            double x = 0.32f + 0.1 * Math.cos(Math.toRadians(i));
            double y = 0.42f + 0.05 * Math.sin(Math.toRadians(i));
            asap1.add(new Vector3f((float) x, (float) y, 0.0f));
        }
        objects.add(new Object2d(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                asap1,
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f)
        ));
        List<Vector3f> asap2 = new ArrayList<>();
        for(double i = 0; i < 360; i += 0.001f) {
            double x = 0.38f + 0.13 * Math.cos(Math.toRadians(i));
            double y = 0.47f + 0.05 * Math.sin(Math.toRadians(i));
            asap2.add(new Vector3f((float) x, (float) y, 0.0f));
        }
        objects.add(new Object2d(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                asap2,
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f)
        ));
        //bintang
        objects.add(new star(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(0.06f,0.72f,0.0f),
                                new Vector3f(0.08f,0.71f,0.0f),
                                new Vector3f(0.04f,0.70f,0.0f),
                                new Vector3f(0.075f,0.68f,0.0f),
                                new Vector3f(0.05f,0.675f,0.0f)
                        )
                ),
                new Vector4f(0.0f, 1f, 1f, 1.0f),
                Arrays.asList(0,3,2,1,4,0,4,1,2,3)
        ));
        //bintang 2
        objects.add(new star(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(-0.31f,0.49f,0.0f),
                                new Vector3f(-0.35f,0.45f,0.0f),
                                new Vector3f(-0.26f,0.46f,0.0f),
                                new Vector3f(-0.33f,0.402f,0.0f),
                                new Vector3f(-0.27f,0.41f,0.0f)
                        )
                ),
                new Vector4f(0.0f, 1f, 1f, 1.0f),
                Arrays.asList(0,3,2,1,4,0,4,1,2,3)
        ));
        //bintang 3
        objects.add(new star(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(0.7f,0.63f,0.0f),
                                new Vector3f(0.66f,0.59f,0.0f),
                                new Vector3f(0.75f,0.60f,0.0f),
                                new Vector3f(0.68f,0.542f,0.0f),
                                new Vector3f(0.74f,0.55f,0.0f)
                        )
                ),
                new Vector4f(0.0f, 1f, 1f, 1.0f),
                Arrays.asList(0,3,2,1,4,0,4,1,2,3)
        ));
//        rectangle dari circle
//        List<Vector3f> verticesRectangle = new ArrayList<>();
//        for(int i = 0; i < 4; i++) {
//            double x = 0.0f + 0.3 * Math.cos(Math.toRadians((double)i*(360/4)+45));
//            double y = 0.0f + 0.3 * Math.sin(Math.toRadians((double)i*(360/4)+45));
//            verticesRectangle.add(new Vector3f((float) x, (float) y, 0.0f));
//        }
//        objects.add(new Object2d(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                verticesRectangle,
//                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f)
//        ));
//        System.out.println(verticesRectangle);
//        //rectangle dari circle
//        List<Vector3f> verticesTriangle = new ArrayList<>();
//        for(int i = 0; i < 4; i++) {
//            double x = 0.0f + 0.3 * Math.cos(Math.toRadians((double)i*(360/3)+90));
//            double y = 0.0f + 0.3 * Math.sin(Math.toRadians((double)i*(360/3)+90));
//            verticesTriangle.add(new Vector3f((float) x, (float) y, 0.0f));
//        }
//        objects.add(new Object2d(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                verticesTriangle,
//                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f)
//        ));
//        System.out.println(verticesTriangle);
    }
    public void loop(){
        while (window.isOpen()) {
            window.update();
            glClearColor(0.0f,
                    0.0f, 0.0f,
                    0.0f);
            GL.createCapabilities();

            //code
            for(Object2d object: objectsRectangle){
                object.draw();
            }
            for(Object2d object: objects){
                object.draw();
            }

            // Restore state
            glDisableVertexAttribArray(0);

            // Poll for window events.
            // The key callback above will only be
            // invoked during this call.
            glfwPollEvents();
        }
    }
    public void run() {

        init();
        loop();

        // Terminate GLFW and
        // free the error callback
        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }
    public static void main(String[] args) {
        new Main().run();
    }
}