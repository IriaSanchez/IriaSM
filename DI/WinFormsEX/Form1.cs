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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btFParte1_Click(object sender, EventArgs e)
        {
            FParte1 FParte1 = new FParte1();
            FParte1.ShowDialog();
        }

        private void btFParte2_Click(object sender, EventArgs e)
        {

            FParte2 FParte2 = new FParte2();
            FParte2.ShowDialog();

        }

        private void btFParte3_Click(object sender, EventArgs e)
        {
            FParte3 FParte3 = new FParte3();
            FParte3.ShowDialog();
        }

        private void btFParte4_Click(object sender, EventArgs e)
        {
            FParte4 FParte4 = new FParte4();
            FParte4.ShowDialog();
        }
    }
}
