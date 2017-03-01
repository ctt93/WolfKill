package com.example.listviewtest;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FruitAdapter extends ArrayAdapter<Fruit> {
private int resourceId;
public FruitAdapter(Context context,int textViewResourceId,List<Fruit> objects){
	super(context,textViewResourceId,objects);
	resourceId=textViewResourceId;
}
@Override
public View getView(int position,View convertView,ViewGroup parent){
	Fruit fruit=getItem(position);
	View view;
	ViewHolder viewHolder;
	if(convertView==null){
		view=LayoutInflater.from(getContext()).inflate(resourceId, null);
		viewHolder=new ViewHolder();
		viewHolder.fruitIamge=(ImageView)view.findViewById(R.id.fruit_image);
		viewHolder.fruitname=(TextView)view.findViewById(R.id.fruit_name);
		view.setTag(viewHolder);
	}else{
		view=convertView;
		viewHolder=(ViewHolder)view.getTag();
	}
	viewHolder.fruitIamge.setImageResource(fruit.getImageId());
	viewHolder.fruitname.setText((position+1)+"ºÅÍæ¼Ò");
	return view;
}
}
