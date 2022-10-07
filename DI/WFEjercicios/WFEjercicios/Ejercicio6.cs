using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WFEjercicios
{
    public partial class Ejercicio6 : Form
    {
        public Ejercicio6()
        {
            InitializeComponent();
        }

        //A medida que se hace scroll por el trackbar, se añade el valor a la label que está a su lado.
        //Se iguala el valor del trackbar y del progressbar
        //Se modifica de texto a string
        //Se activa el timer
        private void trackBar_Scroll(object sender, EventArgs e)
        {
            this.lbTrackBar.Text = trackBar.Value.ToString();
            progressBar.Value = trackBar.Value;
            lbProgressBar.Text = progressBar.Value.ToString();
            timer1.Enabled = true;

        }

        //Se iguala el valor del progressbar al texto de su label y el valor del trackbar al del progresbar
        private void progressBar_Click(object sender, EventArgs e)
        {
            this.lbProgressBar.Text = progressBar.Value.ToString();
            progressBar.Value = trackBar.Value;
        }



        //En el timer que si el valor del texto que hay en la label del progressbar es mayor que 0, avance (en este caso retrocede porque 
        //el step está en -1) modificamos de texto a string
        //de lo contrario, se para, porque el funcionamiento está a falso
        private void timer1_Tick(object sender, EventArgs e)
        {
            if (Int32.Parse(lbProgressBar.Text) > 0)
            {
                progressBar.PerformStep();
                lbProgressBar.Text = progressBar.Value.ToString() ;
            }
            else
            {
                timer1.Enabled=false;
            }
        }
        












       private void lbTrackBar_Click(object sender, EventArgs e)
        {
            
        }

        private void lbProgressBar_Click(object sender, EventArgs e)
        {
         
        }





    }
}
