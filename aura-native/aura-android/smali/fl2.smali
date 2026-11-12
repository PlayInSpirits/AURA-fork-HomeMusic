.class public final synthetic Lfl2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lxl2;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lbm2;

.field public final synthetic p:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lbm2;Ljava/util/List;I)V
    .locals 0

    .line 1
    iput p3, p0, Lfl2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lfl2;->o:Lbm2;

    .line 4
    .line 5
    iput-object p2, p0, Lfl2;->p:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d(Lpu1;I)V
    .locals 6

    .line 1
    iget v0, p0, Lfl2;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, Lfl2;->p:Ljava/util/List;

    .line 6
    .line 7
    iget-object p0, p0, Lfl2;->o:Lbm2;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lbm2;->c:Lmm2;

    .line 13
    .line 14
    new-instance v0, Liw;

    .line 15
    .line 16
    invoke-static {}, Lyw1;->j()Luw1;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-ge v1, v5, :cond_0

    .line 25
    .line 26
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Lgn2;

    .line 31
    .line 32
    invoke-virtual {v5, v2}, Lgn2;->c(Z)Landroid/os/Bundle;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v4, v5}, Lpw1;->c(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {v4}, Luw1;->f()Lgy3;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-direct {v0, v1}, Liw;-><init>(Ljava/util/List;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p1, p0, p2, v0}, Lpu1;->T(Lju1;ILandroid/os/IBinder;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_0
    iget-object p0, p0, Lbm2;->c:Lmm2;

    .line 54
    .line 55
    new-instance v0, Liw;

    .line 56
    .line 57
    invoke-static {}, Lyw1;->j()Luw1;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-ge v1, v5, :cond_1

    .line 66
    .line 67
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    check-cast v5, Lgn2;

    .line 72
    .line 73
    invoke-virtual {v5, v2}, Lgn2;->c(Z)Landroid/os/Bundle;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-virtual {v4, v5}, Lpw1;->c(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    add-int/lit8 v1, v1, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    invoke-virtual {v4}, Luw1;->f()Lgy3;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-direct {v0, v1}, Liw;-><init>(Ljava/util/List;)V

    .line 88
    .line 89
    .line 90
    invoke-interface {p1, p0, p2, v0, v2}, Lpu1;->L(Lju1;ILandroid/os/IBinder;Z)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
