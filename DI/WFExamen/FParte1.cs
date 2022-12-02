using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WFExamen
{
    public partial class FParte1 : Form
    {
        public FParte1()
        {
            InitializeComponent();
        }

        private void FParte1_Load(object sender, EventArgs e)
        {
            this.agregarBoagregarLabelDinamico();

        }

        private void agregarBoagregarLabelDinamico()
        {
            Label lblDinamico = new Label();
            lblDinamico.Name = "lblDinamico";
            lblDinamico.Text = "Examen Windows Forms";
            lblDinamico.Location = new System.Drawing.Point(200, 70);
            lblDinamico.AutoSize=true;
            Font fuente = new Font("Calibri", 12);
            lblDinamico.Font = fuente;                 
            this.panel1.Controls.Add(lblDinamico);

        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
          
                FParte2 FParte2 = new FParte2();
                FParte2.ShowDialog();

            }

        private void button3_Click(object sender, EventArgs e)
        {

            FParte3 FParte3 = new FParte3();
            FParte3.ShowDialog();
        }

        private void button4_Click(object sender, EventArgs e)
        {

            FParte4 FParte4 = new FParte4();
            FParte4.ShowDialog();

        }

        private void button5_Click(object sender, EventArgs e)
        {

            FParte5 FParte5 = new FParte5();
            FParte5.ShowDialog();
        }

        private void button6_Click(object sender, EventArgs e)
        {

            FParte6 FParte6 = new FParte6();
            FParte6.ShowDialog();
        }
    }
    }

