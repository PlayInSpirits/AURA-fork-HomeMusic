.class public final synthetic Ldefpackage/vh3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic a:Ldefpackage/ai3;

.field public final synthetic b:[Landroid/widget/Button;

.field public final synthetic c:Ldefpackage/f9;

.field public final synthetic d:Lcom/google/android/material/slider/Slider;

.field public final synthetic e:Lcom/google/android/material/materialswitch/MaterialSwitch;

.field public final synthetic f:Lcom/google/android/material/materialswitch/MaterialSwitch;

.field public final synthetic g:Lcom/google/android/material/slider/Slider;

.field public final synthetic h:[Z

.field public final synthetic i:Landroid/widget/TextView;

.field public final synthetic j:Landroid/widget/TextView;

.field public final synthetic k:Landroid/widget/Button;

.field public final synthetic l:Landroid/widget/Button;

.field public final synthetic m:Landroid/widget/Button;

.field public final synthetic n:Landroid/widget/Button;

.field public final synthetic o:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/ai3;[Landroid/widget/Button;Ldefpackage/f9;Lcom/google/android/material/slider/Slider;Lcom/google/android/material/materialswitch/MaterialSwitch;Lcom/google/android/material/materialswitch/MaterialSwitch;Lcom/google/android/material/slider/Slider;[ZLandroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/vh3;->a:Ldefpackage/ai3;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/vh3;->b:[Landroid/widget/Button;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/vh3;->c:Ldefpackage/f9;

    .line 9
    .line 10
    iput-object p4, p0, Ldefpackage/vh3;->d:Lcom/google/android/material/slider/Slider;

    .line 11
    .line 12
    iput-object p5, p0, Ldefpackage/vh3;->e:Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 13
    .line 14
    iput-object p6, p0, Ldefpackage/vh3;->f:Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 15
    .line 16
    iput-object p7, p0, Ldefpackage/vh3;->g:Lcom/google/android/material/slider/Slider;

    .line 17
    .line 18
    iput-object p8, p0, Ldefpackage/vh3;->h:[Z

    .line 19
    .line 20
    iput-object p9, p0, Ldefpackage/vh3;->i:Landroid/widget/TextView;

    .line 21
    .line 22
    iput-object p10, p0, Ldefpackage/vh3;->j:Landroid/widget/TextView;

    .line 23
    .line 24
    iput-object p11, p0, Ldefpackage/vh3;->k:Landroid/widget/Button;

    .line 25
    .line 26
    iput-object p12, p0, Ldefpackage/vh3;->l:Landroid/widget/Button;

    .line 27
    .line 28
    iput-object p13, p0, Ldefpackage/vh3;->m:Landroid/widget/Button;

    .line 29
    .line 30
    iput-object p14, p0, Ldefpackage/vh3;->n:Landroid/widget/Button;

    .line 31
    .line 32
    iput-object p15, p0, Ldefpackage/vh3;->o:Landroid/view/View;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const v1, 0x102001b

    .line 4
    .line 5
    .line 6
    iget-object v2, v0, Ldefpackage/vh3;->c:Ldefpackage/f9;

    .line 7
    .line 8
    invoke-virtual {v2, v1}, Ldefpackage/dg;->findViewById(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Landroid/widget/Button;

    .line 13
    .line 14
    iget-object v4, v0, Ldefpackage/vh3;->b:[Landroid/widget/Button;

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    aput-object v1, v4, v8

    .line 18
    .line 19
    iget-object v9, v0, Ldefpackage/vh3;->d:Lcom/google/android/material/slider/Slider;

    .line 20
    .line 21
    invoke-virtual {v9}, Lcom/google/android/material/slider/Slider;->getValue()F

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-static {v2}, Ldefpackage/ai3;->n0(F)F

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-static {v2}, Ldefpackage/ai3;->q0(F)F

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    iget-object v5, v0, Ldefpackage/vh3;->e:Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 34
    .line 35
    invoke-virtual {v5}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    iget-object v6, v0, Ldefpackage/vh3;->f:Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 40
    .line 41
    invoke-virtual {v6}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    iget-object v10, v0, Ldefpackage/vh3;->g:Lcom/google/android/material/slider/Slider;

    .line 46
    .line 47
    invoke-virtual {v10}, Lcom/google/android/material/slider/Slider;->getValue()F

    .line 48
    .line 49
    .line 50
    move-result v11

    .line 51
    invoke-static {v11}, Ldefpackage/ai3;->n0(F)F

    .line 52
    .line 53
    .line 54
    move-result v11

    .line 55
    invoke-static {v11}, Ldefpackage/ai3;->p0(F)F

    .line 56
    .line 57
    .line 58
    move-result v11

    .line 59
    invoke-static {v1, v2, v3, v7, v11}, Ldefpackage/ai3;->v0(Landroid/widget/Button;FZZF)V

    .line 60
    .line 61
    .line 62
    new-instance v2, Ldefpackage/th3;

    .line 63
    .line 64
    iget-object v3, v0, Ldefpackage/vh3;->a:Ldefpackage/ai3;

    .line 65
    .line 66
    move-object v7, v10

    .line 67
    invoke-direct/range {v2 .. v7}, Ldefpackage/th3;-><init>(Ldefpackage/ai3;[Landroid/widget/Button;Lcom/google/android/material/materialswitch/MaterialSwitch;Lcom/google/android/material/materialswitch/MaterialSwitch;Lcom/google/android/material/slider/Slider;)V

    .line 68
    .line 69
    .line 70
    move-object/from16 v16, v4

    .line 71
    .line 72
    iget-object v1, v9, Ldefpackage/uq;->y:Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    aget-object v1, v16, v8

    .line 78
    .line 79
    new-instance v2, Ldefpackage/uh3;

    .line 80
    .line 81
    iget-object v4, v0, Ldefpackage/vh3;->h:[Z

    .line 82
    .line 83
    move-object v8, v7

    .line 84
    move-object v7, v6

    .line 85
    move-object v6, v5

    .line 86
    move-object v5, v9

    .line 87
    iget-object v9, v0, Ldefpackage/vh3;->i:Landroid/widget/TextView;

    .line 88
    .line 89
    iget-object v10, v0, Ldefpackage/vh3;->j:Landroid/widget/TextView;

    .line 90
    .line 91
    iget-object v11, v0, Ldefpackage/vh3;->k:Landroid/widget/Button;

    .line 92
    .line 93
    iget-object v12, v0, Ldefpackage/vh3;->l:Landroid/widget/Button;

    .line 94
    .line 95
    iget-object v13, v0, Ldefpackage/vh3;->m:Landroid/widget/Button;

    .line 96
    .line 97
    iget-object v14, v0, Ldefpackage/vh3;->n:Landroid/widget/Button;

    .line 98
    .line 99
    iget-object v15, v0, Ldefpackage/vh3;->o:Landroid/view/View;

    .line 100
    .line 101
    invoke-direct/range {v2 .. v16}, Ldefpackage/uh3;-><init>(Ldefpackage/ai3;[ZLcom/google/android/material/slider/Slider;Lcom/google/android/material/materialswitch/MaterialSwitch;Lcom/google/android/material/materialswitch/MaterialSwitch;Lcom/google/android/material/slider/Slider;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/view/View;[Landroid/widget/Button;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method
