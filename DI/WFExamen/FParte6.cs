using System;
using System.Windows.Forms;
using System.Drawing;
namespace WFExamen
{
    public partial class FParte6 : Form
    {

        public FParte6()
        {
            InitializeComponent();
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void FParte6_Load(object sender, EventArgs e)
        {
            timer1.Enabled = true;
            timer1.Start();
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            Image img1 = pictureBox1.Image;
            Image img2 = pictureBox2.Image;
            Image img3 = pictureBox3.Image;

            pictureBox1.Image = img2;
            pictureBox2.Image = img3;
            pictureBox3.Image = img1;

        }
    }
}

