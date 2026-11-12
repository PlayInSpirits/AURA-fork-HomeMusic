.class public final synthetic Lz15;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Lsf1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lsf1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lz15;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lz15;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lz15;->p:Lsf1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lz15;->n:I

    .line 2
    .line 3
    sget-object v1, Lj15;->a:Lj15;

    .line 4
    .line 5
    iget-object v2, p0, Lz15;->p:Lsf1;

    .line 6
    .line 7
    iget-object p0, p0, Lz15;->o:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lwd5;

    .line 13
    .line 14
    check-cast v2, Lr70;

    .line 15
    .line 16
    check-cast p1, Lh80;

    .line 17
    .line 18
    iget-boolean v0, p0, Lwd5;->p:Z

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {p1}, Lh80;->d()Lba2;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v3, p1, Lh80;->a:Landroid/view/View;

    .line 27
    .line 28
    invoke-interface {v0}, Lba2;->h()Lea2;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v2, p0, Lwd5;->r:Lr70;

    .line 33
    .line 34
    iget-object v4, p0, Lwd5;->q:Lea2;

    .line 35
    .line 36
    if-nez v4, :cond_1

    .line 37
    .line 38
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v3}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-static {p1, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_0

    .line 55
    .line 56
    new-instance p1, Lw85;

    .line 57
    .line 58
    const/4 v2, 0x5

    .line 59
    invoke-direct {p1, v2, p0, v0}, Lw85;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    iput-object v0, p0, Lwd5;->q:Lea2;

    .line 67
    .line 68
    invoke-virtual {v0, p0}, Lea2;->a(Laa2;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    iget-object v0, v0, Lea2;->h:Lr92;

    .line 73
    .line 74
    sget-object v3, Lr92;->p:Lr92;

    .line 75
    .line 76
    invoke-virtual {v0, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-ltz v0, :cond_2

    .line 81
    .line 82
    iget-object v0, p0, Lwd5;->o:Lz80;

    .line 83
    .line 84
    new-instance v3, Ld90;

    .line 85
    .line 86
    const/4 v4, 0x3

    .line 87
    invoke-direct {v3, p0, p1, v2, v4}, Ld90;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 88
    .line 89
    .line 90
    new-instance p0, Lr70;

    .line 91
    .line 92
    const p1, -0x66c1ecc8

    .line 93
    .line 94
    .line 95
    const/4 v2, 0x1

    .line 96
    invoke-direct {p0, p1, v2, v3}, Lr70;-><init>(IZLsf1;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, p0}, Lz80;->A(Lwf1;)V

    .line 100
    .line 101
    .line 102
    :cond_2
    :goto_0
    return-object v1

    .line 103
    :pswitch_0
    check-cast p0, Lb25;

    .line 104
    .line 105
    check-cast v2, Lif1;

    .line 106
    .line 107
    check-cast p1, Ljava/lang/Long;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget p1, p0, Lb25;->e:F

    .line 113
    .line 114
    const/4 v0, 0x0

    .line 115
    iput v0, p0, Lb25;->e:F

    .line 116
    .line 117
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-interface {v2, p0}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    return-object v1

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
