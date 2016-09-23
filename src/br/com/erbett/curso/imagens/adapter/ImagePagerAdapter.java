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

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import br.com.erbett.curso.imagens.R;

import com.bumptech.glide.Glide;

public class ImagePagerAdapter extends PagerAdapter {

    private transient final LayoutInflater inflater;

    public ImagePagerAdapter(Context context){
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return ImagesAdapter.getLength();
    }


    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.images_item, collection, false);

        ImageView imageView = (ImageView)  layout.findViewById(R.id.image_page);
        TextView textView = (TextView)  layout.findViewById(android.R.id.text1);

        textView.setText(ImagesAdapter.getTitleDrawable(position));

        Glide.with(imageView.getContext())
                .load(ImagesAdapter.getImagesDrawable(position))
                .fitCenter()
                .into(imageView);

        collection.addView(layout);
        return layout;
    }


    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
