using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Reflection.Emit;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using WFExamen.Properties;

namespace WFExamen
{
    public partial class FParte5 : Form
    {
        public FParte5()
        {
            InitializeComponent();
        }

        
        private void FParte5_Load(object sender, EventArgs e)
        {

            //boton dinamico 

            Button btn1 = new Button();
            btn1.Text = "Cambiar";
            btn1.Location = new Point(222, 222);
            btn1.Click += new EventHandler(btn1_Click);
            this.Controls.Add(btn1);
        }

        private void btn1_Click(object sender, EventArgs e)
        {

            //Al darle al boton se crea una variable llamada imagen 1 donde se guarda la imagen de picturebox1 y lo mismo con el 2

            Image img1 = pictureBox1.Image;
            Image img2 = pictureBox2.Image;

            //Cambia la imagen a la variable

            pictureBox1.Image = img2;
            pictureBox2.Image = img1;

        }

    }

}

