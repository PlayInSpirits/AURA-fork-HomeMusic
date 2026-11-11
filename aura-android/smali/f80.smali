.class public final synthetic Lf80;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lh80;

.field public final synthetic p:Lra;

.field public final synthetic q:Lr70;


# direct methods
.method public synthetic constructor <init>(Lh80;Lra;Lr70;I)V
    .locals 0

    .line 14
    const/4 p4, 0x1

    iput p4, p0, Lf80;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf80;->o:Lh80;

    iput-object p2, p0, Lf80;->p:Lra;

    iput-object p3, p0, Lf80;->q:Lr70;

    return-void
.end method

.method public synthetic constructor <init>(Lra;Lh80;Lr70;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lf80;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lf80;->p:Lra;

    .line 8
    .line 9
    iput-object p2, p0, Lf80;->o:Lh80;

    .line 10
    .line 11
    iput-object p3, p0, Lf80;->q:Lr70;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lf80;->n:I

    .line 2
    .line 3
    sget-object v1, Lj15;->a:Lj15;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, Lf80;->q:Lr70;

    .line 7
    .line 8
    iget-object v4, p0, Lf80;->p:Lra;

    .line 9
    .line 10
    iget-object p0, p0, Lf80;->o:Lh80;

    .line 11
    .line 12
    check-cast p1, Lrg1;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {v2}, Lxl;->O(I)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    invoke-virtual {p0, v4, v3, p1, p2}, Lh80;->a(Lra;Lr70;Lrg1;I)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    and-int/lit8 v0, p2, 0x3

    .line 35
    .line 36
    const/4 v5, 0x2

    .line 37
    const/4 v6, 0x0

    .line 38
    if-eq v0, v5, :cond_0

    .line 39
    .line 40
    move v0, v2

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v0, v6

    .line 43
    :goto_0
    and-int/2addr p2, v2

    .line 44
    invoke-virtual {p1, p2, v0}, Lrg1;->K(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-eqz p2, :cond_1

    .line 49
    .line 50
    const p2, 0x33a80f5b

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, p2}, Lrg1;->R(I)V

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, Lh80;->l:Lpa;

    .line 57
    .line 58
    invoke-static {v4, p0, v3, p1, v6}, Lg90;->a(Lub3;Lpa;Lr70;Lrg1;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v6}, Lrg1;->o(Z)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    invoke-virtual {p1}, Lrg1;->N()V

    .line 66
    .line 67
    .line 68
    :goto_1
    return-object v1

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
