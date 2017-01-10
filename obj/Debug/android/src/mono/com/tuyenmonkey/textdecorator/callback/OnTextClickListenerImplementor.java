package mono.com.tuyenmonkey.textdecorator.callback;


public class OnTextClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.tuyenmonkey.textdecorator.callback.OnTextClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClick:(Landroid/view/View;Ljava/lang/String;)V:GetOnClick_Landroid_view_View_Ljava_lang_String_Handler:Com.Tuyenmonkey.Textdecorator.Callback.IOnTextClickListenerInvoker, TextDecorator\n" +
			"";
		mono.android.Runtime.register ("Com.Tuyenmonkey.Textdecorator.Callback.IOnTextClickListenerImplementor, TextDecorator, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", OnTextClickListenerImplementor.class, __md_methods);
	}


	public OnTextClickListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == OnTextClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Tuyenmonkey.Textdecorator.Callback.IOnTextClickListenerImplementor, TextDecorator, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


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
