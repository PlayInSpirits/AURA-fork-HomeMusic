.class public final synthetic Lkj0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lqc2;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ls55;


# direct methods
.method public synthetic constructor <init>(Lq9;Ls55;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lkj0;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lkj0;->o:Ls55;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Ls55;)V
    .locals 1

    .line 10
    const/4 v0, 0x1

    iput v0, p0, Lkj0;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkj0;->o:Ls55;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, Lkj0;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lkj0;->o:Ls55;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Loi3;

    .line 9
    .line 10
    invoke-interface {p1, p0}, Loi3;->a(Ls55;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p1, Lho2;

    .line 15
    .line 16
    iget-object v0, p1, Lho2;->p:Lue1;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v1, v0, Lue1;->p:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Ltb1;

    .line 23
    .line 24
    iget v2, v1, Ltb1;->v:I

    .line 25
    .line 26
    const/4 v3, -0x1

    .line 27
    if-ne v2, v3, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1}, Ltb1;->a()Lsb1;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget v2, p0, Ls55;->a:I

    .line 34
    .line 35
    iput v2, v1, Lsb1;->t:I

    .line 36
    .line 37
    iget v2, p0, Ls55;->b:I

    .line 38
    .line 39
    iput v2, v1, Lsb1;->u:I

    .line 40
    .line 41
    new-instance v2, Ltb1;

    .line 42
    .line 43
    invoke-direct {v2, v1}, Ltb1;-><init>(Lsb1;)V

    .line 44
    .line 45
    .line 46
    new-instance v1, Lue1;

    .line 47
    .line 48
    iget v3, v0, Lue1;->o:I

    .line 49
    .line 50
    iget-object v0, v0, Lue1;->q:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Ljava/lang/String;

    .line 53
    .line 54
    const/4 v4, 0x6

    .line 55
    invoke-direct {v1, v3, v4, v2, v0}, Lue1;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iput-object v1, p1, Lho2;->p:Lue1;

    .line 59
    .line 60
    :cond_0
    iget p0, p0, Ls55;->a:I

    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
