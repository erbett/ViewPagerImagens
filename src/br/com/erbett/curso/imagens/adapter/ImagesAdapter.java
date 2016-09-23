/* 
 * Copyright 2016 Erbett H. R. Oliveira, Inc. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 * 		
 * 		1. Redistributions of source code must retain the above copyright notice, this list of
 * 			conditions and the following disclaimer.
 * 
 * 		2. Redistributions in binary form must reproduce the above copyright notice, this list
 * 		   of conditions and the following disclaimer in the documentation and/or other materials
 *         provided with the distribution.
 *         
 * THIS SOFTWARE IS PROVIDED BY ERBETT HINTON RIBEIRO OLIVEIRA, INC. ''AS IS'' AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, AND LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL ERBETT HINTON RIBEIRO OLIVEIRA, INC. OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * 
 */
package br.com.erbett.curso.imagens.adapter;

import br.com.erbett.curso.imagens.R;

public class ImagesAdapter {

    public static int getImagesDrawable(int position) {
        switch (position) {
            default:
            case 0:
                return R.drawable.image_1;
            case 1:
                return R.drawable.image_2;
            case 2:
                return R.drawable.image_3;
            case 3:
                return R.drawable.image_4;
            case 4:
                return R.drawable.image_5;
            case 5:
                return R.drawable.image_6;
            case 6:
                return  R.drawable.image_7;
            case 7:
                return  R.drawable.image_8;
            case 8:
                return  R.drawable.image_9;
            case 9:
                return  R.drawable.image_10;
            case 10:
                return  R.drawable.image_11;
            case 11:
                return  R.drawable.image_12;
            case 12:
                return  R.drawable.image_13;
            case 13:
                return  R.drawable.image_14;
        }
    }
    
    public static String getTitleDrawable(int position) {
        return ImagesAdapter.titles[position];
    }
    
    public static int getLength(){
    	return ImagesAdapter.titles.length;
    }

    private static final String[] titles = {
            "Imagem teste", "Abbaye du Mont des Cats", "Abertam", "Abondance", "Ackawi",
            "Acorn", "Adelost", "Affidelice au Chablis", "Afuega'l Pitu", "Airag", "Airedale",
            "Aisy Cendre", "Allgauer Emmentaler", "Alverca"};
}
