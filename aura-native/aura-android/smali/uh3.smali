.class public final synthetic Luh3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic A:[Landroid/widget/Button;

.field public final synthetic n:Lai3;

.field public final synthetic o:[Z

.field public final synthetic p:Lcom/google/android/material/slider/Slider;

.field public final synthetic q:Lcom/google/android/material/materialswitch/MaterialSwitch;

.field public final synthetic r:Lcom/google/android/material/materialswitch/MaterialSwitch;

.field public final synthetic s:Lcom/google/android/material/slider/Slider;

.field public final synthetic t:Landroid/widget/TextView;

.field public final synthetic u:Landroid/widget/TextView;

.field public final synthetic v:Landroid/widget/Button;

.field public final synthetic w:Landroid/widget/Button;

.field public final synthetic x:Landroid/widget/Button;

.field public final synthetic y:Landroid/widget/Button;

.field public final synthetic z:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lai3;[ZLcom/google/android/material/slider/Slider;Lcom/google/android/material/materialswitch/MaterialSwitch;Lcom/google/android/material/materialswitch/MaterialSwitch;Lcom/google/android/material/slider/Slider;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/view/View;[Landroid/widget/Button;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Luh3;->n:Lai3;

    .line 5
    .line 6
    iput-object p2, p0, Luh3;->o:[Z

    .line 7
    .line 8
    iput-object p3, p0, Luh3;->p:Lcom/google/android/material/slider/Slider;

    .line 9
    .line 10
    iput-object p4, p0, Luh3;->q:Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 11
    .line 12
    iput-object p5, p0, Luh3;->r:Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 13
    .line 14
    iput-object p6, p0, Luh3;->s:Lcom/google/android/material/slider/Slider;

    .line 15
    .line 16
    iput-object p7, p0, Luh3;->t:Landroid/widget/TextView;

    .line 17
    .line 18
    iput-object p8, p0, Luh3;->u:Landroid/widget/TextView;

    .line 19
    .line 20
    iput-object p9, p0, Luh3;->v:Landroid/widget/Button;

    .line 21
    .line 22
    iput-object p10, p0, Luh3;->w:Landroid/widget/Button;

    .line 23
    .line 24
    iput-object p11, p0, Luh3;->x:Landroid/widget/Button;

    .line 25
    .line 26
    iput-object p12, p0, Luh3;->y:Landroid/widget/Button;

    .line 27
    .line 28
    iput-object p13, p0, Luh3;->z:Landroid/view/View;

    .line 29
    .line 30
    iput-object p14, p0, Luh3;->A:[Landroid/widget/Button;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    const/4 p1, 0x1

    .line 2
    iget-object v0, p0, Luh3;->o:[Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    aput-boolean p1, v0, v1

    .line 6
    .line 7
    const/high16 p1, 0x3f800000    # 1.0f

    .line 8
    .line 9
    invoke-static {p1}, Lai3;->o0(F)F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-object v3, p0, Luh3;->p:Lcom/google/android/material/slider/Slider;

    .line 14
    .line 15
    invoke-virtual {v3, v2}, Lcom/google/android/material/slider/Slider;->setValue(F)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Luh3;->q:Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 21
    .line 22
    .line 23
    iget-object v2, p0, Luh3;->r:Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lai3;->o0(F)F

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    iget-object v4, p0, Luh3;->s:Lcom/google/android/material/slider/Slider;

    .line 33
    .line 34
    invoke-virtual {v4, v3}, Lcom/google/android/material/slider/Slider;->setValue(F)V

    .line 35
    .line 36
    .line 37
    aput-boolean v1, v0, v1

    .line 38
    .line 39
    iget-object v0, p0, Luh3;->n:Lai3;

    .line 40
    .line 41
    iget-object v3, p0, Luh3;->t:Landroid/widget/TextView;

    .line 42
    .line 43
    invoke-virtual {v0, v3, p1}, Lai3;->x0(Landroid/widget/TextView;F)V

    .line 44
    .line 45
    .line 46
    iget-object v3, p0, Luh3;->u:Landroid/widget/TextView;

    .line 47
    .line 48
    invoke-virtual {v0, v3, p1}, Lai3;->u0(Landroid/widget/TextView;F)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, Lud3;->r0(F)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, Lud3;->s0(F)V

    .line 55
    .line 56
    .line 57
    iget-object v3, p0, Luh3;->v:Landroid/widget/Button;

    .line 58
    .line 59
    iget-object v4, p0, Luh3;->w:Landroid/widget/Button;

    .line 60
    .line 61
    invoke-static {v3, v4, p1}, Lai3;->r0(Landroid/widget/Button;Landroid/widget/Button;F)V

    .line 62
    .line 63
    .line 64
    iget-object v3, p0, Luh3;->x:Landroid/widget/Button;

    .line 65
    .line 66
    iget-object v4, p0, Luh3;->y:Landroid/widget/Button;

    .line 67
    .line 68
    invoke-static {v3, v4, p1}, Lai3;->r0(Landroid/widget/Button;Landroid/widget/Button;F)V

    .line 69
    .line 70
    .line 71
    iget-object v3, p0, Luh3;->z:Landroid/view/View;

    .line 72
    .line 73
    invoke-static {v2, v3, v1, v1}, Lai3;->t0(Lcom/google/android/material/materialswitch/MaterialSwitch;Landroid/view/View;ZZ)V

    .line 74
    .line 75
    .line 76
    iget-object p0, p0, Luh3;->A:[Landroid/widget/Button;

    .line 77
    .line 78
    aget-object p0, p0, v1

    .line 79
    .line 80
    invoke-static {p0, p1, v1, v1, p1}, Lai3;->v0(Landroid/widget/Button;FZZF)V

    .line 81
    .line 82
    .line 83
    iget-object p0, v0, Lai3;->B0:Lvj3;

    .line 84
    .line 85
    if-eqz p0, :cond_0

    .line 86
    .line 87
    invoke-virtual {p0, p1}, Lvj3;->a(F)V

    .line 88
    .line 89
    .line 90
    :cond_0
    return-void
.end method
