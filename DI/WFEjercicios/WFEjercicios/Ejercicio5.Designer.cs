namespace WFEjercicios
{
    partial class Ejercicio5
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.timer1 = new System.Windows.Forms.Timer(this.components);
            this.lbCuentaAtras = new System.Windows.Forms.Label();
            this.tbEjercicio5 = new System.Windows.Forms.TextBox();
            this.btPulsar = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // timer1
            // 
            this.timer1.Interval = 1000;
            this.timer1.Tick += new System.EventHandler(this.timer1_Tick);
            // 
            // lbCuentaAtras
            // 
            this.lbCuentaAtras.AutoSize = true;
            this.lbCuentaAtras.Location = new System.Drawing.Point(243, 190);
            this.lbCuentaAtras.Name = "lbCuentaAtras";
            this.lbCuentaAtras.Size = new System.Drawing.Size(0, 13);
            this.lbCuentaAtras.TabIndex = 0;
            this.lbCuentaAtras.Click += new System.EventHandler(this.lbCuentaAtras_Click);
            // 
            // tbEjercicio5
            // 
            this.tbEjercicio5.Location = new System.Drawing.Point(232, 118);
            this.tbEjercicio5.Name = "tbEjercicio5";
            this.tbEjercicio5.Size = new System.Drawing.Size(91, 20);
            this.tbEjercicio5.TabIndex = 1;
            this.tbEjercicio5.TextChanged += new System.EventHandler(this.tbEjercicio5_TextChanged);
            // 
            // btPulsar
            // 
            this.btPulsar.Location = new System.Drawing.Point(343, 109);
            this.btPulsar.Name = "btPulsar";
            this.btPulsar.Size = new System.Drawing.Size(96, 36);
            this.btPulsar.TabIndex = 2;
            this.btPulsar.Text = "Iniciar/Pausar";
            this.btPulsar.UseVisualStyleBackColor = true;
            this.btPulsar.Click += new System.EventHandler(this.btIniciarPausar_Click);
            // 
            // Ejercicio5
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.btPulsar);
            this.Controls.Add(this.tbEjercicio5);
            this.Controls.Add(this.lbCuentaAtras);
            this.Name = "Ejercicio5";
            this.Text = "Ejercicio5";
            this.Load += new System.EventHandler(this.Ejercicio5_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Timer timer1;
        private System.Windows.Forms.Label lbCuentaAtras;
        private System.Windows.Forms.TextBox tbEjercicio5;
        private System.Windows.Forms.Button btPulsar;
    }
}