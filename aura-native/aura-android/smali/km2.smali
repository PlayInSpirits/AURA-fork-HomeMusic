.class public final synthetic Lkm2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Llm2;
.implements Lyr2;


# instance fields
.field public final synthetic n:Lmi3;


# direct methods
.method public synthetic constructor <init>(Lmi3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkm2;->n:Lmi3;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public c(Lbm2;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Lbm2;->Y()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_3

    .line 8
    .line 9
    :cond_0
    iget-object v0, p1, Lbm2;->y:Lmi3;

    .line 10
    .line 11
    iget-object p0, p0, Lkm2;->n:Lmi3;

    .line 12
    .line 13
    invoke-static {v0, p0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    goto/16 :goto_3

    .line 20
    .line 21
    :cond_1
    iput-object p0, p1, Lbm2;->y:Lmi3;

    .line 22
    .line 23
    iget-object v0, p1, Lbm2;->z:Lmi3;

    .line 24
    .line 25
    iget-object v1, p1, Lbm2;->x:Lmi3;

    .line 26
    .line 27
    invoke-static {v1, p0}, Lbm2;->Y0(Lmi3;Lmi3;)Lmi3;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iput-object p0, p1, Lbm2;->z:Lmi3;

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lmi3;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    const/4 v0, 0x1

    .line 38
    const/4 v1, 0x0

    .line 39
    if-nez p0, :cond_2

    .line 40
    .line 41
    iget-object p0, p1, Lbm2;->u:Lgy3;

    .line 42
    .line 43
    iget-object v2, p1, Lbm2;->v:Lgy3;

    .line 44
    .line 45
    iget-object v3, p1, Lbm2;->t:Lyw1;

    .line 46
    .line 47
    iget-object v4, p1, Lbm2;->s:Lyw1;

    .line 48
    .line 49
    iget-object v5, p1, Lbm2;->w:Lwa4;

    .line 50
    .line 51
    iget-object v6, p1, Lbm2;->z:Lmi3;

    .line 52
    .line 53
    iget-object v7, p1, Lbm2;->I:Landroid/os/Bundle;

    .line 54
    .line 55
    invoke-static {v3, v4, v5, v6, v7}, Lbm2;->u1(Ljava/util/List;Ljava/util/List;Lwa4;Lmi3;Landroid/os/Bundle;)Lgy3;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    iput-object v3, p1, Lbm2;->u:Lgy3;

    .line 60
    .line 61
    iget-object v4, p1, Lbm2;->s:Lyw1;

    .line 62
    .line 63
    iget-object v5, p1, Lbm2;->I:Landroid/os/Bundle;

    .line 64
    .line 65
    iget-object v6, p1, Lbm2;->w:Lwa4;

    .line 66
    .line 67
    iget-object v7, p1, Lbm2;->z:Lmi3;

    .line 68
    .line 69
    invoke-static {v3, v4, v5, v6, v7}, Lbm2;->t1(Lgy3;Ljava/util/List;Landroid/os/Bundle;Lwa4;Lmi3;)Lgy3;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    iput-object v3, p1, Lbm2;->v:Lgy3;

    .line 74
    .line 75
    iget-object v3, p1, Lbm2;->u:Lgy3;

    .line 76
    .line 77
    invoke-virtual {v3, p0}, Lyw1;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    xor-int/2addr p0, v0

    .line 82
    iget-object v3, p1, Lbm2;->v:Lgy3;

    .line 83
    .line 84
    invoke-virtual {v3, v2}, Lyw1;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    xor-int/2addr v2, v0

    .line 89
    iget-object v3, p1, Lbm2;->i:Ltc2;

    .line 90
    .line 91
    new-instance v4, Lcl2;

    .line 92
    .line 93
    const/4 v5, 0x2

    .line 94
    invoke-direct {v4, p1, v5}, Lcl2;-><init>(Lbm2;I)V

    .line 95
    .line 96
    .line 97
    const/16 v5, 0xd

    .line 98
    .line 99
    invoke-virtual {v3, v5, v4}, Ltc2;->f(ILqc2;)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_2
    move p0, v1

    .line 104
    move v2, p0

    .line 105
    :goto_0
    if-eqz v2, :cond_4

    .line 106
    .line 107
    invoke-virtual {p1}, Lbm2;->f1()Lsk2;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    iget-object v4, v2, Lsk2;->f:Landroid/os/Handler;

    .line 119
    .line 120
    invoke-virtual {v4}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    if-ne v3, v4, :cond_3

    .line 125
    .line 126
    move v3, v0

    .line 127
    goto :goto_1

    .line 128
    :cond_3
    move v3, v1

    .line 129
    :goto_1
    invoke-static {v3}, Lrr2;->w(Z)V

    .line 130
    .line 131
    .line 132
    iget-object v2, v2, Lsk2;->e:Lqk2;

    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    :cond_4
    if-eqz p0, :cond_6

    .line 138
    .line 139
    invoke-virtual {p1}, Lbm2;->f1()Lsk2;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    iget-object v2, p0, Lsk2;->f:Landroid/os/Handler;

    .line 151
    .line 152
    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    if-ne p1, v2, :cond_5

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_5
    move v0, v1

    .line 160
    :goto_2
    invoke-static {v0}, Lrr2;->w(Z)V

    .line 161
    .line 162
    .line 163
    iget-object p0, p0, Lsk2;->e:Lqk2;

    .line 164
    .line 165
    invoke-interface {p0}, Lqk2;->u()V

    .line 166
    .line 167
    .line 168
    :cond_6
    :goto_3
    return-void
.end method

.method public f(Ler2;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lkm2;->n:Lmi3;

    .line 2
    .line 3
    invoke-interface {p1, p2, p0}, Ler2;->t(ILmi3;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
