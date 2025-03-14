package FIleView;

public class Client {
    public static void main(String[] args) {
        ImageFile imageFile1 = new ImageFile("image1.jpg");
        ImageFile imageFile2 = new ImageFile("image2.jpg");
        VideoFile videoFile1 = new VideoFile("video1.mp4");
        VideoFile videoFile2 = new VideoFile("video2.jpg");
        TextFile textFile1 = new TextFile("text1.txt");
        TextFile textFile2 = new TextFile("text2.txt");
        TextFile textFile3 = new TextFile("text3.txt");
        Folder folder = new Folder("folder");
        Folder folder1 = new Folder("folder1");
        folder.add(imageFile1);
        folder.add(imageFile2);
        folder.add(videoFile1);
        folder.remove(videoFile1);
        folder1.add(videoFile2);
        folder1.add(textFile1);
        folder1.add(textFile2);
        folder1.add(textFile3);
        System.out.println("文件夹一");
        folder.display();
        System.out.println("文件夹二");
        folder1.display();
    }
}
