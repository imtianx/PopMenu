package cn.imtianx.popmenu;


import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.imtianx.popmenu.dialog.ActionSheetDialog;
import cn.imtianx.popmenu.dialog.ActionSheetDialog.OnSheetItemClickListener;
import cn.imtianx.popmenu.dialog.ActionSheetDialog.SheetItemColor;
import cn.imtianx.popmenu.dialog.AlertDialog;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.btn_mesage)
    Button btnMesage;
    @Bind(R.id.btn_image)
    Button btnImage;
    @Bind(R.id.btn_list)
    Button btnList;
    @Bind(R.id.btn_dialog1)
    Button btnDialog1;
    @Bind(R.id.btn_dialog2)
    Button btnDialog2;


    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = MainActivity.this;
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.btn_mesage, R.id.btn_image, R.id.btn_list, R.id.btn_dialog1, R.id.btn_dialog2})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_mesage:

                new ActionSheetDialog(context)
                        .builder()
                        .setTitle("清空消息列表后，聊天记录依然保留，确定要清空消息列表？")
                        .setCancelable(false)
                        .setCanceledOnTouchOutside(false)
                        .addSheetItem("清空消息列表", ActionSheetDialog.SheetItemColor.Red
                                , new ActionSheetDialog.OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {

                            }
                        }).show();

                break;
            case R.id.btn_image:

                new ActionSheetDialog(context)
                        .builder()
                        .setCancelable(false)
                        .setCanceledOnTouchOutside(false)
                        .addSheetItem("发送给好友", SheetItemColor.Blue,
                                new OnSheetItemClickListener() {
                                    @Override
                                    public void onClick(int which) {

                                    }
                                })
                        .addSheetItem("转载到空间相册", SheetItemColor.Blue,
                                new OnSheetItemClickListener() {
                                    @Override
                                    public void onClick(int which) {

                                    }
                                })
                        .addSheetItem("上传到群相册", SheetItemColor.Blue,
                                new OnSheetItemClickListener() {
                                    @Override
                                    public void onClick(int which) {

                                    }
                                })
                        .addSheetItem("保存到手机", SheetItemColor.Blue,
                                new OnSheetItemClickListener() {
                                    @Override
                                    public void onClick(int which) {

                                    }
                                })
                        .addSheetItem("收藏", SheetItemColor.Blue,
                                new OnSheetItemClickListener() {
                                    @Override
                                    public void onClick(int which) {

                                    }
                                })
                        .addSheetItem("查看聊天图片", SheetItemColor.Blue,
                                new OnSheetItemClickListener() {
                                    @Override
                                    public void onClick(int which) {

                                    }
                                }).show();

                break;
            case R.id.btn_list:
                new ActionSheetDialog(context)
                        .builder()
                        .setTitle("请选择操作")
                        .setCancelable(false)
                        .setCanceledOnTouchOutside(false)
                        .addSheetItem("条目一", SheetItemColor.Blue,
                                new OnSheetItemClickListener() {
                                    @Override
                                    public void onClick(int which) {
                                        Toast.makeText(context,
                                                "item" + which, Toast.LENGTH_SHORT)
                                                .show();
                                    }
                                })
                        .addSheetItem("条目二", SheetItemColor.Blue,
                                new OnSheetItemClickListener() {
                                    @Override
                                    public void onClick(int which) {
                                        Toast.makeText(context,
                                                "item" + which, Toast.LENGTH_SHORT)
                                                .show();
                                    }
                                })
                        .addSheetItem("条目三", SheetItemColor.Blue,
                                new OnSheetItemClickListener() {
                                    @Override
                                    public void onClick(int which) {
                                        Toast.makeText(context,
                                                "item" + which, Toast.LENGTH_SHORT)
                                                .show();
                                    }
                                })
                        .addSheetItem("条目四", SheetItemColor.Blue,
                                new OnSheetItemClickListener() {
                                    @Override
                                    public void onClick(int which) {
                                        Toast.makeText(context,
                                                "item" + which, Toast.LENGTH_SHORT)
                                                .show();
                                    }
                                })
                        .addSheetItem("条目五", SheetItemColor.Blue,
                                new OnSheetItemClickListener() {
                                    @Override
                                    public void onClick(int which) {
                                        Toast.makeText(context,
                                                "item" + which, Toast.LENGTH_SHORT)
                                                .show();
                                    }
                                })
                        .addSheetItem("条目六", SheetItemColor.Blue,
                                new OnSheetItemClickListener() {
                                    @Override
                                    public void onClick(int which) {
                                        Toast.makeText(context,
                                                "item" + which, Toast.LENGTH_SHORT)
                                                .show();
                                    }
                                })
                        .addSheetItem("条目七", SheetItemColor.Blue,
                                new OnSheetItemClickListener() {
                                    @Override
                                    public void onClick(int which) {
                                        Toast.makeText(context,
                                                "item" + which, Toast.LENGTH_SHORT)
                                                .show();
                                    }
                                })
                        .addSheetItem("条目八", SheetItemColor.Blue,
                                new OnSheetItemClickListener() {
                                    @Override
                                    public void onClick(int which) {
                                        Toast.makeText(context,
                                                "item" + which, Toast.LENGTH_SHORT)
                                                .show();
                                    }
                                })
                        .addSheetItem("条目九", SheetItemColor.Blue,
                                new OnSheetItemClickListener() {
                                    @Override
                                    public void onClick(int which) {
                                        Toast.makeText(context,
                                                "item" + which, Toast.LENGTH_SHORT)
                                                .show();
                                    }
                                })
                        .addSheetItem("条目十", SheetItemColor.Blue,
                                new OnSheetItemClickListener() {
                                    @Override
                                    public void onClick(int which) {
                                        Toast.makeText(context,
                                                "item" + which, Toast.LENGTH_SHORT)
                                                .show();
                                    }
                                }).show();
                break;

            case R.id.btn_dialog1:
                new AlertDialog(context).builder().setTitle("退出当前账号")
                        .setMsg("再连续登陆15天，就可变身为QQ达人。退出QQ可能会使你现有记录归零，确定退出？")
                        .setPositiveButton("确认退出", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        }).setNegativeButton("取消", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }).show();

                break;

            case R.id.btn_dialog2:

                new AlertDialog(context).builder()
                        .setMsg("你现在无法接收到新消息提醒。请到系统-设置-通知中开启消息提醒")
                        .setNegativeButton("确定", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        }).show();


                break;
            default:
                break;
        }
    }


}
