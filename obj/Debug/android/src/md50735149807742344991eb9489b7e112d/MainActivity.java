package md50735149807742344991eb9489b7e112d;


public class MainActivity
	extends android.support.v7.app.AppCompatActivity
	implements
		mono.android.IGCUserPeer,
		com.tuyenmonkey.textdecorator.callback.OnTextClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onClick:(Landroid/view/View;Ljava/lang/String;)V:GetOnClick_Landroid_view_View_Ljava_lang_String_Handler:Com.Tuyenmonkey.Textdecorator.Callback.IOnTextClickListenerInvoker, TextDecorator\n" +
			"";
		mono.android.Runtime.register ("XamarinTextDecorator.MainActivity, XamarinTextDecorator, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MainActivity.class, __md_methods);
	}


	public MainActivity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MainActivity.class)
			mono.android.TypeManager.Activate ("XamarinTextDecorator.MainActivity, XamarinTextDecorator, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void onClick (android.view.View p0, java.lang.String p1)
	{
		n_onClick (p0, p1);
	}

	private native void n_onClick (android.view.View p0, java.lang.String p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
