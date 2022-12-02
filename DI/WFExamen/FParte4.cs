using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement.Button;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace WFExamen
{
    public partial class FParte4 : Form
    {
        public FParte4()
        {
            InitializeComponent();
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

            //tambien con stringbuilder

            //Si está marcado el 1 que es de saludar, saca mensaje hola + el texto del combobox1
            if (radioButton1.Checked)
            {
                MessageBox.Show("Hola " + comboBox1.Text);
            }

            //Si está marcado el 2 que es de despedir, saca mensaje hola + el texto del combobox1

            if (radioButton2.Checked)
            {
                MessageBox.Show("Adios " + comboBox1.Text);

            }

        }
    }
}
