using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using WFEjercicios.Properties;

namespace WFEjercicios
{
    public partial class Ejercicio3 : Form
    {
        public Ejercicio3()
        {
            InitializeComponent();
        }

        private void rbMañana_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void pbCoches_Click(object sender, EventArgs e)
        {
            
        }

        private void rbFiat_CheckedChanged(object sender, EventArgs e)
        {
            elegirCoche();


        }

        private void rbFerrari_CheckedChanged(object sender, EventArgs e)
        {

            elegirCoche();

        }

        private void rbSeat_CheckedChanged(object sender, EventArgs e)
        {
            elegirCoche();


        }
       
        private void rbRojo_CheckedChanged(object sender, EventArgs e)
        {
            elegirCoche();

        }

        private void rbNegro_CheckedChanged(object sender, EventArgs e)
        {
            elegirCoche();

        }

        private void rbBlanco_CheckedChanged(object sender, EventArgs e)
        {
            elegirCoche();

        }




        private void elegirCoche()
        {
            if (rbFiat.Checked){

                if (rbBlanco.Checked){
                    pbCoches.Image = Resources.fiatBlanco;

                }if (rbNegro.Checked){
                    pbCoches.Image = Resources.fiatNegro;

                }if (rbRojo.Checked){
                    pbCoches.Image = Resources.fiatRojo;
                }
            }


            if (rbFerrari.Checked){

                if (rbBlanco.Checked){
                    pbCoches.Image = Resources.ferrariBlanco;

                }if (rbNegro.Checked){
                    pbCoches.Image = Resources.ferrariNegro;

                }if (rbRojo.Checked){
                    pbCoches.Image = Resources.ferrariRojo;
                }
            }

            if (rbSeat.Checked){

                if (rbBlanco.Checked){
                    pbCoches.Image = Resources.seatBlanco;

                }if (rbNegro.Checked){
                    pbCoches.Image = Resources.seatNegro;

                }if (rbRojo.Checked){
                    pbCoches.Image = Resources.seatRojo;
                }
            }
        }

    }
}

