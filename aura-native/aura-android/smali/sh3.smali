.class public final synthetic Lsh3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lai3;

.field public final synthetic p:Lcom/google/android/material/slider/Slider;

.field public final synthetic q:Lcom/google/android/material/slider/Slider;

.field public final synthetic r:Landroid/widget/TextView;

.field public final synthetic s:Landroid/widget/Button;

.field public final synthetic t:Landroid/widget/Button;


# direct methods
.method public synthetic constructor <init>(Lai3;Lcom/google/android/material/slider/Slider;Lcom/google/android/material/slider/Slider;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;I)V
    .locals 0

    .line 1
    iput p7, p0, Lsh3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lsh3;->o:Lai3;

    .line 4
    .line 5
    iput-object p2, p0, Lsh3;->p:Lcom/google/android/material/slider/Slider;

    .line 6
    .line 7
    iput-object p3, p0, Lsh3;->q:Lcom/google/android/material/slider/Slider;

    .line 8
    .line 9
    iput-object p4, p0, Lsh3;->r:Landroid/widget/TextView;

    .line 10
    .line 11
    iput-object p5, p0, Lsh3;->s:Landroid/widget/Button;

    .line 12
    .line 13
    iput-object p6, p0, Lsh3;->t:Landroid/widget/Button;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 14

    .line 1
    iget p1, p0, Lsh3;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v5, p0, Lsh3;->t:Landroid/widget/Button;

    .line 7
    .line 8
    const v6, 0x3d4ccccd    # 0.05f

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lsh3;->o:Lai3;

    .line 12
    .line 13
    iget-object v1, p0, Lsh3;->p:Lcom/google/android/material/slider/Slider;

    .line 14
    .line 15
    iget-object v2, p0, Lsh3;->q:Lcom/google/android/material/slider/Slider;

    .line 16
    .line 17
    iget-object v3, p0, Lsh3;->r:Landroid/widget/TextView;

    .line 18
    .line 19
    iget-object v4, p0, Lsh3;->s:Landroid/widget/Button;

    .line 20
    .line 21
    invoke-virtual/range {v0 .. v6}, Lai3;->s0(Lcom/google/android/material/slider/Slider;Lcom/google/android/material/slider/Slider;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;F)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    iget-object v12, p0, Lsh3;->t:Landroid/widget/Button;

    .line 26
    .line 27
    const v13, -0x42b33333    # -0.05f

    .line 28
    .line 29
    .line 30
    iget-object v7, p0, Lsh3;->o:Lai3;

    .line 31
    .line 32
    iget-object v8, p0, Lsh3;->p:Lcom/google/android/material/slider/Slider;

    .line 33
    .line 34
    iget-object v9, p0, Lsh3;->q:Lcom/google/android/material/slider/Slider;

    .line 35
    .line 36
    iget-object v10, p0, Lsh3;->r:Landroid/widget/TextView;

    .line 37
    .line 38
    iget-object v11, p0, Lsh3;->s:Landroid/widget/Button;

    .line 39
    .line 40
    invoke-virtual/range {v7 .. v13}, Lai3;->s0(Lcom/google/android/material/slider/Slider;Lcom/google/android/material/slider/Slider;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;F)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
