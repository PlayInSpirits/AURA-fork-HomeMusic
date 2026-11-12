.class public final synthetic Lts2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lit2;
.implements Lwc0;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Z

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Lts2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lts2;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iput-boolean p2, p0, Lts2;->o:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lts2;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lil;

    .line 4
    .line 5
    iget-boolean p0, p0, Lts2;->o:Z

    .line 6
    .line 7
    check-cast p1, Lal3;

    .line 8
    .line 9
    invoke-virtual {p1, v0, p0}, Lal3;->k0(Lil;Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public h(Ltn2;Lfr2;I)Ljava/lang/Object;
    .locals 12

    .line 1
    iget p3, p0, Lts2;->n:I

    .line 2
    .line 3
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/4 v2, -0x1

    .line 9
    iget-boolean v3, p0, Lts2;->o:Z

    .line 10
    .line 11
    iget-object p0, p0, Lts2;->p:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch p3, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object v6, p0

    .line 17
    check-cast v6, Ljava/util/List;

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    :goto_0
    move v7, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    iget-object p0, p1, Ltn2;->s:Lal3;

    .line 24
    .line 25
    invoke-virtual {p0}, Lal3;->o0()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    goto :goto_0

    .line 30
    :goto_1
    if-eqz v3, :cond_1

    .line 31
    .line 32
    :goto_2
    move-object v4, p1

    .line 33
    move-object v5, p2

    .line 34
    move-wide v8, v0

    .line 35
    goto :goto_3

    .line 36
    :cond_1
    iget-object p0, p1, Ltn2;->s:Lal3;

    .line 37
    .line 38
    invoke-virtual {p0}, Lal3;->M0()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    goto :goto_2

    .line 43
    :goto_3
    invoke-virtual/range {v4 .. v9}, Ltn2;->x(Lfr2;Ljava/util/List;IJ)Llb4;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :pswitch_0
    move-object v4, p1

    .line 49
    move-object v5, p2

    .line 50
    check-cast p0, Lgn2;

    .line 51
    .line 52
    invoke-static {p0}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    if-eqz v3, :cond_2

    .line 57
    .line 58
    goto :goto_4

    .line 59
    :cond_2
    iget-object p1, v4, Ltn2;->s:Lal3;

    .line 60
    .line 61
    invoke-virtual {p1}, Lal3;->o0()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    :goto_4
    if-eqz v3, :cond_3

    .line 66
    .line 67
    :goto_5
    move v3, v2

    .line 68
    move-object v2, p0

    .line 69
    move-wide v10, v0

    .line 70
    move-object v0, v4

    .line 71
    move-object v1, v5

    .line 72
    move-wide v4, v10

    .line 73
    goto :goto_6

    .line 74
    :cond_3
    iget-object p1, v4, Ltn2;->s:Lal3;

    .line 75
    .line 76
    invoke-virtual {p1}, Lal3;->M0()J

    .line 77
    .line 78
    .line 79
    move-result-wide v0

    .line 80
    goto :goto_5

    .line 81
    :goto_6
    invoke-virtual/range {v0 .. v5}, Ltn2;->x(Lfr2;Ljava/util/List;IJ)Llb4;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
