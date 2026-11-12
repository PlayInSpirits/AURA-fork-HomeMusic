.class public final synthetic Lbm0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgo4;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lbm0;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Lbm0;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lbm0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lbm0;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lbm0;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lbm0;->o:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lqe4;

    .line 11
    .line 12
    check-cast v1, Lpe4;

    .line 13
    .line 14
    invoke-virtual {v1}, Lpe4;->a()Loe4;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v2, 0x1

    .line 19
    iput v2, v0, Loe4;->d:I

    .line 20
    .line 21
    sget-object v2, Lne4;->k:Lxm;

    .line 22
    .line 23
    iput-object v2, v0, Loe4;->J:Lxm;

    .line 24
    .line 25
    iget-object p0, p0, Lfq;->b:Lbu4;

    .line 26
    .line 27
    iget-object v2, v1, Lpe4;->D:Lne4;

    .line 28
    .line 29
    invoke-interface {v2}, Lne4;->get()J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    invoke-static {v2, v3, v1, p0}, Lqe4;->h1(JLpe4;Lbu4;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    new-instance p0, Lxm;

    .line 38
    .line 39
    invoke-direct {p0, v2, v3}, Lxm;-><init>(J)V

    .line 40
    .line 41
    .line 42
    iput-object p0, v0, Loe4;->H:Lxm;

    .line 43
    .line 44
    iget-object p0, v1, Lpe4;->E:Lxm;

    .line 45
    .line 46
    iput-object p0, v0, Loe4;->I:Lxm;

    .line 47
    .line 48
    new-instance p0, Lpe4;

    .line 49
    .line 50
    invoke-direct {p0, v0}, Lpe4;-><init>(Loe4;)V

    .line 51
    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_0
    check-cast p0, Lau;

    .line 55
    .line 56
    check-cast v1, Lbi0;

    .line 57
    .line 58
    new-instance v0, Ljr3;

    .line 59
    .line 60
    iget-object p0, p0, Lau;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p0, Ln51;

    .line 63
    .line 64
    invoke-direct {v0, v1, p0}, Ljr3;-><init>(Lbi0;Ln51;)V

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
