class FlipImage {
    public  int[][] flipAndInvertImage(int[][] image) {
        // for every row in image array
            for(int[] row : image){
                // reverse the array
                for(int i=0;i<(image[0].length+1)/2;i++){
                    int temp = row[i]^1;
                    row[i] = row[image[0].length-i-1]^1;
                    row[image[0].length-i-1]=temp;
                }
            }
            return image;
    }
}
