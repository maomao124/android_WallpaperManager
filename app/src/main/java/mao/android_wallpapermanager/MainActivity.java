package mao.android_wallpapermanager;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity
{

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WallpaperManager wallpaperManager = WallpaperManager.getInstance(this);

        try
        {
            wallpaperManager.setResource(R.drawable.test);
            toastShow("壁纸设置成功");

        }
        catch (IOException e)
        {
            e.printStackTrace();
            toastShow("壁纸设置失败，失败原因：" + e.getMessage());
        }
    }

    /**
     * 显示消息
     *
     * @param message 消息
     */
    private void toastShow(String message)
    {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}