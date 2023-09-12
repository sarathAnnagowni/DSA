package com.annotations;

public class AnnotationExample {

    @CustomAnnotation("Hello, Custom Annotation!")
    public void myAnnotatedMethod() {
        // Method implementation
    }

    public static void main(String[] args) {
        // Access the annotation and its attributes
        AnnotationExample example = new AnnotationExample();
        try {
            CustomAnnotation annotation = example.getClass().getMethod("myAnnotatedMethod").getAnnotation(CustomAnnotation.class);
            System.out.println("Custom Annotation Value: " + annotation.value());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
