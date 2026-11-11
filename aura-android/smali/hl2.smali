.class public final synthetic Lhl2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lxl2;
.implements Lwc0;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:I

.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;III)V
    .locals 0

    .line 1
    iput p5, p0, Lhl2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lhl2;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lhl2;->r:Ljava/lang/Object;

    .line 6
    .line 7
    iput p3, p0, Lhl2;->p:I

    .line 8
    .line 9
    iput p4, p0, Lhl2;->q:I

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lhl2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkt2;

    .line 4
    .line 5
    iget-object v1, p0, Lhl2;->r:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/view/Surface;

    .line 8
    .line 9
    check-cast p1, Lal3;

    .line 10
    .line 11
    iget-object v2, v0, Lkt2;->e:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Ltn2;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    invoke-virtual {p1, p0}, Lal3;->Q(Landroid/view/SurfaceHolder;)V

    .line 26
    .line 27
    .line 28
    iput-object p0, v0, Lkt2;->j:Ljt2;

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    new-instance v2, Ljt2;

    .line 32
    .line 33
    iget v3, p0, Lhl2;->p:I

    .line 34
    .line 35
    iget p0, p0, Lhl2;->q:I

    .line 36
    .line 37
    invoke-direct {v2, v1, v3, p0}, Ljt2;-><init>(Landroid/view/Surface;II)V

    .line 38
    .line 39
    .line 40
    iput-object v2, v0, Lkt2;->j:Ljt2;

    .line 41
    .line 42
    invoke-virtual {p1, v2}, Lal3;->Q(Landroid/view/SurfaceHolder;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public d(Lpu1;I)V
    .locals 8

    .line 1
    iget v1, p0, Lhl2;->n:I

    .line 2
    .line 3
    iget-object v2, p0, Lhl2;->r:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v3, p0, Lhl2;->o:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v3, Lbm2;

    .line 11
    .line 12
    check-cast v2, Landroid/view/Surface;

    .line 13
    .line 14
    iget v5, p0, Lhl2;->q:I

    .line 15
    .line 16
    iget-object v1, v3, Lbm2;->c:Lmm2;

    .line 17
    .line 18
    iget v4, p0, Lhl2;->p:I

    .line 19
    .line 20
    move-object v0, p1

    .line 21
    move-object v3, v2

    .line 22
    move v2, p2

    .line 23
    invoke-interface/range {v0 .. v5}, Lpu1;->z0(Lju1;ILandroid/view/Surface;II)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_0
    move-object v6, v3

    .line 28
    check-cast v6, Lbm2;

    .line 29
    .line 30
    check-cast v2, Ljava/util/List;

    .line 31
    .line 32
    new-instance v5, Liw;

    .line 33
    .line 34
    invoke-static {}, Lyw1;->j()Luw1;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const/4 v3, 0x0

    .line 39
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-ge v3, v4, :cond_0

    .line 44
    .line 45
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Lgn2;

    .line 50
    .line 51
    const/4 v7, 0x1

    .line 52
    invoke-virtual {v4, v7}, Lgn2;->c(Z)Landroid/os/Bundle;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v1, v4}, Lpw1;->c(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {v1}, Luw1;->f()Lgy3;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-direct {v5, v1}, Liw;-><init>(Ljava/util/List;)V

    .line 67
    .line 68
    .line 69
    iget-object v1, v6, Lbm2;->n:Lcb4;

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v1, v1, Lcb4;->a:Lbb4;

    .line 75
    .line 76
    invoke-interface {v1}, Lbb4;->f()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    iget-object v2, v6, Lbm2;->c:Lmm2;

    .line 81
    .line 82
    iget v3, p0, Lhl2;->p:I

    .line 83
    .line 84
    iget v4, p0, Lhl2;->q:I

    .line 85
    .line 86
    const/4 v0, 0x2

    .line 87
    if-lt v1, v0, :cond_1

    .line 88
    .line 89
    move-object v0, p1

    .line 90
    move-object v1, v2

    .line 91
    move v2, p2

    .line 92
    invoke-interface/range {v0 .. v5}, Lpu1;->P(Lju1;IIILandroid/os/IBinder;)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_1
    move-object v1, v2

    .line 97
    invoke-interface {p1, v1, p2, v4, v5}, Lpu1;->Z(Lju1;IILandroid/os/IBinder;)V

    .line 98
    .line 99
    .line 100
    iget-object v1, v6, Lbm2;->c:Lmm2;

    .line 101
    .line 102
    invoke-interface {p1, v1, p2, v3, v4}, Lpu1;->M(Lju1;III)V

    .line 103
    .line 104
    .line 105
    :goto_1
    return-void

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
