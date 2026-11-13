.class public final synthetic Ldefpackage/zh3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:Ldefpackage/ai3;

.field public final synthetic b:Lcom/google/android/material/materialswitch/MaterialSwitch;

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:Lcom/google/android/material/materialswitch/MaterialSwitch;

.field public final synthetic e:[Landroid/widget/Button;

.field public final synthetic f:Lcom/google/android/material/slider/Slider;

.field public final synthetic g:Lcom/google/android/material/slider/Slider;

.field public final synthetic h:[Z


# direct methods
.method public synthetic constructor <init>(Ldefpackage/ai3;Lcom/google/android/material/materialswitch/MaterialSwitch;Landroid/view/View;Lcom/google/android/material/materialswitch/MaterialSwitch;[Landroid/widget/Button;Lcom/google/android/material/slider/Slider;Lcom/google/android/material/slider/Slider;[Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/zh3;->a:Ldefpackage/ai3;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/zh3;->b:Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/zh3;->c:Landroid/view/View;

    .line 9
    .line 10
    iput-object p4, p0, Ldefpackage/zh3;->d:Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 11
    .line 12
    iput-object p5, p0, Ldefpackage/zh3;->e:[Landroid/widget/Button;

    .line 13
    .line 14
    iput-object p6, p0, Ldefpackage/zh3;->f:Lcom/google/android/material/slider/Slider;

    .line 15
    .line 16
    iput-object p7, p0, Ldefpackage/zh3;->g:Lcom/google/android/material/slider/Slider;

    .line 17
    .line 18
    iput-object p8, p0, Ldefpackage/zh3;->h:[Z

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 5

    .line 1
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "playback_speed_manual_pitch"

    .line 17
    .line 18
    invoke-interface {p1, v0, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Ldefpackage/zh3;->d:Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-object v1, p0, Ldefpackage/zh3;->b:Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 32
    .line 33
    iget-object v2, p0, Ldefpackage/zh3;->c:Landroid/view/View;

    .line 34
    .line 35
    invoke-static {v1, v2, v0, p2}, Ldefpackage/ai3;->t0(Lcom/google/android/material/materialswitch/MaterialSwitch;Landroid/view/View;ZZ)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Ldefpackage/zh3;->e:[Landroid/widget/Button;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    aget-object v0, v0, v1

    .line 42
    .line 43
    iget-object v2, p0, Ldefpackage/zh3;->f:Lcom/google/android/material/slider/Slider;

    .line 44
    .line 45
    invoke-virtual {v2}, Lcom/google/android/material/slider/Slider;->getValue()F

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-static {v3}, Ldefpackage/ai3;->n0(F)F

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-static {v3}, Ldefpackage/ai3;->q0(F)F

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    iget-object v4, p0, Ldefpackage/zh3;->g:Lcom/google/android/material/slider/Slider;

    .line 62
    .line 63
    invoke-virtual {v4}, Lcom/google/android/material/slider/Slider;->getValue()F

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    invoke-static {v4}, Ldefpackage/ai3;->n0(F)F

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    invoke-static {v4}, Ldefpackage/ai3;->p0(F)F

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    invoke-static {v0, v3, p1, p2, v4}, Ldefpackage/ai3;->v0(Landroid/widget/Button;FZZF)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Ldefpackage/zh3;->h:[Z

    .line 79
    .line 80
    aget-boolean p1, p1, v1

    .line 81
    .line 82
    if-eqz p1, :cond_0

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    iget-object p0, p0, Ldefpackage/zh3;->a:Ldefpackage/ai3;

    .line 86
    .line 87
    iget-object p0, p0, Ldefpackage/ai3;->B0:Ldefpackage/vj3;

    .line 88
    .line 89
    if-eqz p0, :cond_1

    .line 90
    .line 91
    invoke-virtual {v2}, Lcom/google/android/material/slider/Slider;->getValue()F

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    invoke-static {p1}, Ldefpackage/ai3;->n0(F)F

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-static {p1}, Ldefpackage/ai3;->q0(F)F

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    invoke-virtual {p0, p1}, Ldefpackage/vj3;->a(F)V

    .line 104
    .line 105
    .line 106
    :cond_1
    :goto_0
    return-void
.end method
