.class public final synthetic Lyh3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:Lai3;

.field public final synthetic b:Lcom/google/android/material/materialswitch/MaterialSwitch;

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:[Landroid/widget/Button;

.field public final synthetic e:Lcom/google/android/material/slider/Slider;

.field public final synthetic f:Lcom/google/android/material/slider/Slider;

.field public final synthetic g:[Z


# direct methods
.method public synthetic constructor <init>(Lai3;Lcom/google/android/material/materialswitch/MaterialSwitch;Landroid/view/View;[Landroid/widget/Button;Lcom/google/android/material/slider/Slider;Lcom/google/android/material/slider/Slider;[Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyh3;->a:Lai3;

    .line 5
    .line 6
    iput-object p2, p0, Lyh3;->b:Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 7
    .line 8
    iput-object p3, p0, Lyh3;->c:Landroid/view/View;

    .line 9
    .line 10
    iput-object p4, p0, Lyh3;->d:[Landroid/widget/Button;

    .line 11
    .line 12
    iput-object p5, p0, Lyh3;->e:Lcom/google/android/material/slider/Slider;

    .line 13
    .line 14
    iput-object p6, p0, Lyh3;->f:Lcom/google/android/material/slider/Slider;

    .line 15
    .line 16
    iput-object p7, p0, Lyh3;->g:[Z

    .line 17
    .line 18
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
    const-string v0, "playback_speed_pitch"

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
    iget-object p1, p0, Lyh3;->b:Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-object v1, p0, Lyh3;->c:Landroid/view/View;

    .line 32
    .line 33
    invoke-static {p1, v1, p2, v0}, Lai3;->t0(Lcom/google/android/material/materialswitch/MaterialSwitch;Landroid/view/View;ZZ)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lyh3;->d:[Landroid/widget/Button;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    aget-object v0, v0, v1

    .line 40
    .line 41
    iget-object v2, p0, Lyh3;->e:Lcom/google/android/material/slider/Slider;

    .line 42
    .line 43
    invoke-virtual {v2}, Lcom/google/android/material/slider/Slider;->getValue()F

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-static {v3}, Lai3;->n0(F)F

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    invoke-static {v3}, Lai3;->q0(F)F

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    iget-object v4, p0, Lyh3;->f:Lcom/google/android/material/slider/Slider;

    .line 60
    .line 61
    invoke-virtual {v4}, Lcom/google/android/material/slider/Slider;->getValue()F

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    invoke-static {v4}, Lai3;->n0(F)F

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    invoke-static {v4}, Lai3;->p0(F)F

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    invoke-static {v0, v3, p2, p1, v4}, Lai3;->v0(Landroid/widget/Button;FZZF)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lyh3;->g:[Z

    .line 77
    .line 78
    aget-boolean p1, p1, v1

    .line 79
    .line 80
    if-eqz p1, :cond_0

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    iget-object p0, p0, Lyh3;->a:Lai3;

    .line 84
    .line 85
    iget-object p0, p0, Lai3;->B0:Lvj3;

    .line 86
    .line 87
    if-eqz p0, :cond_1

    .line 88
    .line 89
    invoke-virtual {v2}, Lcom/google/android/material/slider/Slider;->getValue()F

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    invoke-static {p1}, Lai3;->n0(F)F

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    invoke-static {p1}, Lai3;->q0(F)F

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    invoke-virtual {p0, p1}, Lvj3;->a(F)V

    .line 102
    .line 103
    .line 104
    :cond_1
    :goto_0
    return-void
.end method
