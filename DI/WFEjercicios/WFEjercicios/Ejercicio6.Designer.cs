namespace WFEjercicios
{
    partial class Ejercicio6
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
            this.trackBar = new System.Windows.Forms.TrackBar();
            this.progressBar = new System.Windows.Forms.ProgressBar();
            this.lbTrackBar = new System.Windows.Forms.Label();
            this.lbProgressBar = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.trackBar)).BeginInit();
            this.SuspendLayout();
            // 
            // timer1
            // 
            this.timer1.Interval = 1000;
            this.timer1.Tick += new System.EventHandler(this.timer1_Tick);
            // 
            // trackBar
            // 
            this.trackBar.Location = new System.Drawing.Point(222, 106);
            this.trackBar.Maximum = 30;
            this.trackBar.Name = "trackBar";
            this.trackBar.Size = new System.Drawing.Size(104, 45);
            this.trackBar.TabIndex = 0;
            this.trackBar.Value = 10;
            this.trackBar.Scroll += new System.EventHandler(this.trackBar_Scroll);
            // 
            // progressBar
            // 
            this.progressBar.Location = new System.Drawing.Point(222, 189);
            this.progressBar.Maximum = 30;
            this.progressBar.Name = "progressBar";
            this.progressBar.Size = new System.Drawing.Size(100, 23);
            this.progressBar.Step = -1;
            this.progressBar.TabIndex = 1;
            this.progressBar.Value = 10;
            this.progressBar.Click += new System.EventHandler(this.progressBar_Click);
            // 
            // lbTrackBar
            // 
            this.lbTrackBar.AutoSize = true;
            this.lbTrackBar.Location = new System.Drawing.Point(429, 120);
            this.lbTrackBar.Name = "lbTrackBar";
            this.lbTrackBar.Size = new System.Drawing.Size(59, 13);
            this.lbTrackBar.TabIndex = 2;
            this.lbTrackBar.Text = "lbTrackBar";
            this.lbTrackBar.Click += new System.EventHandler(this.lbTrackBar_Click);
            // 
            // lbProgressBar
            // 
            this.lbProgressBar.AutoSize = true;
            this.lbProgressBar.Location = new System.Drawing.Point(432, 189);
            this.lbProgressBar.Name = "lbProgressBar";
            this.lbProgressBar.Size = new System.Drawing.Size(72, 13);
            this.lbProgressBar.TabIndex = 3;
            this.lbProgressBar.Text = "lbProgressBar";
            this.lbProgressBar.Click += new System.EventHandler(this.lbProgressBar_Click);
            // 
            // Ejercicio6
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.lbProgressBar);
            this.Controls.Add(this.lbTrackBar);
            this.Controls.Add(this.progressBar);
            this.Controls.Add(this.trackBar);
            this.Name = "Ejercicio6";
            this.Text = "Ejercicio6";
            ((System.ComponentModel.ISupportInitialize)(this.trackBar)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Timer timer1;
        private System.Windows.Forms.TrackBar trackBar;
        private System.Windows.Forms.ProgressBar progressBar;
        private System.Windows.Forms.Label lbTrackBar;
        private System.Windows.Forms.Label lbProgressBar;
    }
}