package example.fussen.dropdownmenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Fussen on 16/8/31.
 */

public class MenuListAdapter extends BaseAdapter {
    private Context context;

    private ViewHolder viewHolder;

    private List<String> list;

    public MenuListAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        viewHolder = new ViewHolder();
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.act_item_popu_list, null);
        }

        viewHolder.text1 = (TextView) convertView.findViewById(R.id.textname);
        viewHolder.text1.setText(list.get(position));

        return convertView;
    }

    private class ViewHolder {
        private TextView text1;
    }
}
