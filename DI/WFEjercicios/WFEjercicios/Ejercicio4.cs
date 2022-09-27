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
    public partial class Ejercicio4 : Form
    {

        WMPLib.WindowsMediaPlayer wplayer = new WMPLib.WindowsMediaPlayer();

        public Ejercicio4()
        {
            InitializeComponent();
        }

        private void cbMusica_SelectedIndexChanged(object sender, EventArgs e)
        {
            elegirGenero();
        }



        private void lbMusica_SelectedIndexChanged(object sender, EventArgs e)
        {
            reproducirCancion();
            
        }



        private void elegirGenero(){
            if (cbMusica.SelectedIndex == 0){

                lbMusica.Items.Clear();
                lbMusica.Items.Add("El lago de los cisnes");
            }
            if (cbMusica.SelectedIndex == 1){

                lbMusica.Items.Clear();
                lbMusica.Items.Add("New rules");
            }

            if (cbMusica.SelectedIndex == 2){

                lbMusica.Items.Clear();
                lbMusica.Items.Add("Canción");
            }
        }


        private void reproducirCancion() {

            if (lbMusica.Text == "El lago de los cisnes"){

                wplayer.controls.stop();
                wplayer.URL = @"C:\Users\FP\Desktop\DesarrolloInterfaces\Canciones\clasica\El Lago de los Cisnes (Ballet de Moscú) Swan Lake (128 kbps).mp3";
                wplayer.controls.play();

            }if (lbMusica.Text == "New rules"){

                wplayer.controls.stop();
                wplayer.URL = @"C:\Users\FP\Desktop\DesarrolloInterfaces\Canciones\pop\Dua Lipa - New Rules (Official Music Video) (128 kbps).mp3";
                wplayer.controls.play();
                

            }if (lbMusica.Text == "Canción"){

                wplayer.controls.stop();
                wplayer.URL = @"C:\Users\FP\Desktop\DesarrolloInterfaces\Canciones\electronica\Electrónica Con Potente Bajo Para Retumbar Mucho!!! (128 kbps).mp3";
                wplayer.controls.play();
            }
        }
    }
}



