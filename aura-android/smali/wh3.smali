.class public final synthetic Lwh3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldg4;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lai3;

.field public final synthetic c:Landroid/widget/TextView;

.field public final synthetic d:Landroid/widget/Button;

.field public final synthetic e:Landroid/widget/Button;

.field public final synthetic f:[Landroid/widget/Button;

.field public final synthetic g:Lcom/google/android/material/slider/Slider;

.field public final synthetic h:Lcom/google/android/material/materialswitch/MaterialSwitch;

.field public final synthetic i:Lcom/google/android/material/materialswitch/MaterialSwitch;

.field public final synthetic j:Lcom/google/android/material/slider/Slider;


# direct methods
.method public synthetic constructor <init>(Lai3;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;[Landroid/widget/Button;Lcom/google/android/material/materialswitch/MaterialSwitch;Lcom/google/android/material/materialswitch/MaterialSwitch;Lcom/google/android/material/slider/Slider;Lcom/google/android/material/slider/Slider;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwh3;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwh3;->b:Lai3;

    .line 8
    .line 9
    iput-object p2, p0, Lwh3;->c:Landroid/widget/TextView;

    .line 10
    .line 11
    iput-object p3, p0, Lwh3;->d:Landroid/widget/Button;

    .line 12
    .line 13
    iput-object p4, p0, Lwh3;->e:Landroid/widget/Button;

    .line 14
    .line 15
    iput-object p5, p0, Lwh3;->f:[Landroid/widget/Button;

    .line 16
    .line 17
    iput-object p6, p0, Lwh3;->h:Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 18
    .line 19
    iput-object p7, p0, Lwh3;->i:Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 20
    .line 21
    iput-object p8, p0, Lwh3;->g:Lcom/google/android/material/slider/Slider;

    .line 22
    .line 23
    iput-object p9, p0, Lwh3;->j:Lcom/google/android/material/slider/Slider;

    .line 24
    .line 25
    return-void
.end method

.method public synthetic constructor <init>(Lai3;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;[Landroid/widget/Button;Lcom/google/android/material/slider/Slider;Lcom/google/android/material/materialswitch/MaterialSwitch;Lcom/google/android/material/materialswitch/MaterialSwitch;Lcom/google/android/material/slider/Slider;)V
    .locals 1

    .line 26
    const/4 v0, 0x1

    iput v0, p0, Lwh3;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh3;->b:Lai3;

    iput-object p2, p0, Lwh3;->c:Landroid/widget/TextView;

    iput-object p3, p0, Lwh3;->d:Landroid/widget/Button;

    iput-object p4, p0, Lwh3;->e:Landroid/widget/Button;

    iput-object p5, p0, Lwh3;->f:[Landroid/widget/Button;

    iput-object p6, p0, Lwh3;->g:Lcom/google/android/material/slider/Slider;

    iput-object p7, p0, Lwh3;->h:Lcom/google/android/material/materialswitch/MaterialSwitch;

    iput-object p8, p0, Lwh3;->i:Lcom/google/android/material/materialswitch/MaterialSwitch;

    iput-object p9, p0, Lwh3;->j:Lcom/google/android/material/slider/Slider;

    return-void
.end method


# virtual methods
.method public final a(FZ)V
    .locals 10

    .line 1
    iget v0, p0, Lwh3;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lwh3;->j:Lcom/google/android/material/slider/Slider;

    .line 5
    .line 6
    iget-object v3, p0, Lwh3;->i:Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 7
    .line 8
    iget-object v4, p0, Lwh3;->h:Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 9
    .line 10
    iget-object v5, p0, Lwh3;->g:Lcom/google/android/material/slider/Slider;

    .line 11
    .line 12
    iget-object v6, p0, Lwh3;->f:[Landroid/widget/Button;

    .line 13
    .line 14
    iget-object v7, p0, Lwh3;->e:Landroid/widget/Button;

    .line 15
    .line 16
    iget-object v8, p0, Lwh3;->d:Landroid/widget/Button;

    .line 17
    .line 18
    iget-object v9, p0, Lwh3;->c:Landroid/widget/TextView;

    .line 19
    .line 20
    iget-object p0, p0, Lwh3;->b:Lai3;

    .line 21
    .line 22
    packed-switch v0, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Lai3;->n0(F)F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-static {p1}, Lai3;->p0(F)F

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-virtual {p0, v9, p1}, Lai3;->u0(Landroid/widget/TextView;F)V

    .line 34
    .line 35
    .line 36
    invoke-static {v8, v7, p1}, Lai3;->r0(Landroid/widget/Button;Landroid/widget/Button;F)V

    .line 37
    .line 38
    .line 39
    aget-object v0, v6, v1

    .line 40
    .line 41
    invoke-virtual {v5}, Lcom/google/android/material/slider/Slider;->getValue()F

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-static {v1}, Lai3;->n0(F)F

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-static {v1}, Lai3;->q0(F)F

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-virtual {v4}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-virtual {v3}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-static {v0, v1, v4, v3, p1}, Lai3;->v0(Landroid/widget/Button;FZZF)V

    .line 62
    .line 63
    .line 64
    if-nez p2, :cond_0

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-static {p1}, Lai3;->o0(F)F

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    invoke-virtual {v2, p2}, Lcom/google/android/material/slider/Slider;->setValue(F)V

    .line 72
    .line 73
    .line 74
    invoke-static {p1}, Lud3;->s0(F)V

    .line 75
    .line 76
    .line 77
    iget-object p0, p0, Lai3;->B0:Lvj3;

    .line 78
    .line 79
    if-eqz p0, :cond_1

    .line 80
    .line 81
    invoke-virtual {v5}, Lcom/google/android/material/slider/Slider;->getValue()F

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    invoke-static {p1}, Lai3;->n0(F)F

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    invoke-static {p1}, Lai3;->q0(F)F

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    invoke-virtual {p0, p1}, Lvj3;->a(F)V

    .line 94
    .line 95
    .line 96
    :cond_1
    :goto_0
    return-void

    .line 97
    :pswitch_0
    invoke-static {p1}, Lai3;->n0(F)F

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    invoke-static {p1}, Lai3;->q0(F)F

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    invoke-virtual {p0, v9, p1}, Lai3;->x0(Landroid/widget/TextView;F)V

    .line 106
    .line 107
    .line 108
    invoke-static {v8, v7, p1}, Lai3;->r0(Landroid/widget/Button;Landroid/widget/Button;F)V

    .line 109
    .line 110
    .line 111
    aget-object v0, v6, v1

    .line 112
    .line 113
    invoke-virtual {v4}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    invoke-virtual {v3}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    invoke-virtual {v5}, Lcom/google/android/material/slider/Slider;->getValue()F

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    invoke-static {v4}, Lai3;->n0(F)F

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    invoke-static {v4}, Lai3;->p0(F)F

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    invoke-static {v0, p1, v1, v3, v4}, Lai3;->v0(Landroid/widget/Button;FZZF)V

    .line 134
    .line 135
    .line 136
    if-nez p2, :cond_2

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_2
    invoke-static {p1}, Lai3;->o0(F)F

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    invoke-virtual {v2, p2}, Lcom/google/android/material/slider/Slider;->setValue(F)V

    .line 144
    .line 145
    .line 146
    invoke-static {p1}, Lud3;->r0(F)V

    .line 147
    .line 148
    .line 149
    iget-object p0, p0, Lai3;->B0:Lvj3;

    .line 150
    .line 151
    if-eqz p0, :cond_3

    .line 152
    .line 153
    invoke-virtual {p0, p1}, Lvj3;->a(F)V

    .line 154
    .line 155
    .line 156
    :cond_3
    :goto_1
    return-void

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
