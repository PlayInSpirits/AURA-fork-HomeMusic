.class public final Ldefpackage/a91;
.super Ldefpackage/ep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/xf1;


# instance fields
.field public o:I

.field public synthetic p:Ldefpackage/q81;

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ldefpackage/wf1;


# direct methods
.method public constructor <init>(Ldefpackage/wf1;Ldefpackage/vd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/a91;->r:Ldefpackage/wf1;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, Ldefpackage/ep4;-><init>(ILdefpackage/vd0;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ldefpackage/q81;

    .line 2
    .line 3
    check-cast p3, Ldefpackage/vd0;

    .line 4
    .line 5
    new-instance v0, Ldefpackage/a91;

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/a91;->r:Ldefpackage/wf1;

    .line 8
    .line 9
    invoke-direct {v0, p0, p3}, Ldefpackage/a91;-><init>(Ldefpackage/wf1;Ldefpackage/vd0;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Ldefpackage/a91;->p:Ldefpackage/q81;

    .line 13
    .line 14
    iput-object p2, v0, Ldefpackage/a91;->q:Ljava/lang/Object;

    .line 15
    .line 16
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ldefpackage/a91;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Ldefpackage/a91;->o:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    sget-object v4, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    if-eq v0, v3, :cond_1

    .line 11
    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_1
    iget-object v0, p0, Ldefpackage/a91;->p:Ldefpackage/q81;

    .line 25
    .line 26
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Ldefpackage/a91;->p:Ldefpackage/q81;

    .line 34
    .line 35
    iget-object p1, p0, Ldefpackage/a91;->q:Ljava/lang/Object;

    .line 36
    .line 37
    iput-object v0, p0, Ldefpackage/a91;->p:Ldefpackage/q81;

    .line 38
    .line 39
    iput v3, p0, Ldefpackage/a91;->o:I

    .line 40
    .line 41
    iget-object v3, p0, Ldefpackage/a91;->r:Ldefpackage/wf1;

    .line 42
    .line 43
    invoke-interface {v3, p1, p0}, Ldefpackage/wf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-ne p1, v4, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    :goto_0
    iput-object v1, p0, Ldefpackage/a91;->p:Ldefpackage/q81;

    .line 51
    .line 52
    iput v2, p0, Ldefpackage/a91;->o:I

    .line 53
    .line 54
    invoke-interface {v0, p1, p0}, Ldefpackage/q81;->b(Ljava/lang/Object;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    if-ne p0, v4, :cond_4

    .line 59
    .line 60
    :goto_1
    return-object v4

    .line 61
    :cond_4
    :goto_2
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 62
    .line 63
    return-object p0
.end method
