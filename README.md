# PopMenu
自定义对话框的使用，仿照ios。从底部弹出，类似pop窗口。包括消息、图片、列表及对话框。

演示效果：
![image](https://github.com/txadf/PopMenu/blob/master/1.gif)


使用方法：<br>

		new ActionSheetDialog(context).show();
       new ActionSheetDialog(context).show();
注：context = 当前activity.this;

具体用法：
		
		//(1)
        new ActionSheetDialog (context)
        .builder()
        .setTitle ("清空消息列表后，聊天记录依然保留，确定要清空消息列表？")
        .setCancelable (false)
        .setCanceledOnTouchOutside (false)
        .addSheetItem ("清空消息列表", ActionSheetDialog.SheetItemColor.Red
                       , new ActionSheetDialog.OnSheetItemClickListener()
        {
            @Override
            public void onClick (int which)
            {

            }
        }).show();

		//(2)
        new ActionSheetDialog (context)
        .builder()
        .setTitle ("清空消息列表后，聊天记录依然保留，确定要清空消息列表？")
        .setCancelable (false)
        .setCanceledOnTouchOutside (false)
        .addSheetItem ("清空消息列表", ActionSheetDialog.SheetItemColor.Red
                       , new ActionSheetDialog.OnSheetItemClickListener()
        {
            @Override
            public void onClick (int which)
            {

            }
        }).show();
