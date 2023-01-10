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
    public partial class FParte2 : Form
    {


        BindingList<Prenda> prendas = new BindingList<Prenda>();
        public FParte2()
        {
            InitializeComponent();
        }


        private void FParte2_Load(object sender, EventArgs e)
        {
            prendas.Add(new Prenda
            {

              

            });

            dataGridView1.DataSource= prendas;
           
        }

            private void btRegistrar_Click(object sender, EventArgs e)
        {

            if (rbSombrero.Checked = true
)
            {

            }



            rbPantalon.Checked = true;
        }
    }

    internal class Prenda
    {
    }
}
