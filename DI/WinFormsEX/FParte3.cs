using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WinFormsEX
{
    public partial class FParte3 : Form
    {
        public FParte3()
        {
            InitializeComponent();
        }

        private void trackBar1_Scroll(object sender, EventArgs e)
        {
            this.lb1.Text = trackBar1.Value.ToString();
            lb1.Text = trackBar1.Value.ToString();
            progressBar1.Value = trackBar1.Value;
        }

        private void lb1_Click(object sender, EventArgs e)
        {
            this.lb1.Text=trackBar1.Value.ToString();
        }

        private void progressBar1_Click(object sender, EventArgs e)
        {
            this.lb2.Text = progressBar1.Value.ToString();
            lb2.Text = progressBar1.Value.ToString();
            progressBar1.Value = trackBar1.Value;

            if (progressBar1.Value == 20)
            {
                MessageBox.Show("SUPERADO MÁXIMO");

            }

        }

        private void lb2_Click(object sender, EventArgs e)
        {
            this.lb2.Text = progressBar1.Value.ToString();

        }

        private void btAñadir_Click(object sender, EventArgs e)
        {
            
        }
    }
}
