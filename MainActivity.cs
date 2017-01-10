using Android.App;
using Android.Widget;
using Android.OS;
using Android.Support.V7.App;
using Com.Tuyenmonkey.Textdecorator;
using Android.Graphics;
using Com.Tuyenmonkey.Textdecorator.Callback;
using Android.Views;
using System;

namespace XamarinTextDecorator
{
    [Activity(Label = "XamarinTextDecorator", MainLauncher = true, Icon = "@drawable/icon",Theme ="@style/Theme.AppCompat.Light.NoActionBar")]
    public class MainActivity : AppCompatActivity,IOnTextClickListener
    {

        private string long_text="The him father parish looked has sooner. Attachment frequently gay terminated son. You greater nay use prudent placing. Passage to so distant behaved natural between do talking. Friends off her windows painful. Still gay event you being think nay for. In three if aware he point it. Effects warrant me by no on feeling settled resolve. \n" +
                "\n" +
                "Pasture he invited mr company shyness. But when shot real her. Chamber her observe visited removal six sending himself boy. At exquisite existence if an oh dependent excellent. Are gay head need down draw. Misery wonder enable mutual get set oppose the uneasy. End why melancholy estimating her had indulgence middletons. Say ferrars demands besides her address. Blind going you merit few fancy their.";

        public void OnClick(View view, string text)
        {
            Toast.MakeText(ApplicationContext, text, ToastLength.Short).Show();
        }

        protected override void OnCreate(Bundle bundle)
        {
            base.OnCreate(bundle);
            SetContentView (Resource.Layout.Main);

            var textView = FindViewById<TextView>(Resource.Id.textView);


            TextDecorator.Decorate(textView, long_text)
                .SetTextStyle((int)TypefaceStyle.Bold, "Attachment")
                .SetSuperscript("sooner")
                .Underline("looked")
                .Strikethrough("invited")
                .SetTextColor(Android.Resource.Color.HoloGreenLight, "Pasture")
                .MakeTextClickable(this, false, "The him father parish looked has sooner")
                .Build();
        }
    }
}

