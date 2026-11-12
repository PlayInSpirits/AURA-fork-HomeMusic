.class public final Lh73;
.super Lep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public o:I

.field public final synthetic p:Llm0;

.field public final synthetic q:Z

.field public final synthetic r:Lb13;

.field public final synthetic s:Lb13;

.field public final synthetic t:Lb13;

.field public final synthetic u:Lb13;


# direct methods
.method public constructor <init>(Llm0;ZLb13;Lb13;Lb13;Lb13;Lvd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh73;->p:Llm0;

    .line 2
    .line 3
    iput-boolean p2, p0, Lh73;->q:Z

    .line 4
    .line 5
    iput-object p3, p0, Lh73;->r:Lb13;

    .line 6
    .line 7
    iput-object p4, p0, Lh73;->s:Lb13;

    .line 8
    .line 9
    iput-object p5, p0, Lh73;->t:Lb13;

    .line 10
    .line 11
    iput-object p6, p0, Lh73;->u:Lb13;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, Lep4;-><init>(ILvd0;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvd0;)Lvd0;
    .locals 8

    .line 1
    new-instance v0, Lh73;

    .line 2
    .line 3
    iget-object v5, p0, Lh73;->t:Lb13;

    .line 4
    .line 5
    iget-object v6, p0, Lh73;->u:Lb13;

    .line 6
    .line 7
    iget-object v1, p0, Lh73;->p:Llm0;

    .line 8
    .line 9
    iget-boolean v2, p0, Lh73;->q:Z

    .line 10
    .line 11
    iget-object v3, p0, Lh73;->r:Lb13;

    .line 12
    .line 13
    iget-object v4, p0, Lh73;->s:Lb13;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, Lh73;-><init>(Llm0;ZLb13;Lb13;Lb13;Lb13;Lvd0;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lwe0;

    .line 2
    .line 3
    check-cast p2, Lvd0;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lh73;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lh73;

    .line 10
    .line 11
    sget-object p1, Lj15;->a:Lj15;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lh73;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lh73;->o:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_1
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance p1, Lh82;

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    iget-object v4, p0, Lh73;->p:Llm0;

    .line 26
    .line 27
    invoke-direct {p1, v4, v0}, Lh82;-><init>(Llm0;I)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Lqv3;

    .line 31
    .line 32
    invoke-direct {v0, p1, v1}, Lqv3;-><init>(Lgf1;Lvd0;)V

    .line 33
    .line 34
    .line 35
    new-instance p1, Lgc0;

    .line 36
    .line 37
    invoke-direct {p1, v2, v0}, Lgc0;-><init>(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    new-instance v3, Lg73;

    .line 41
    .line 42
    iget-object v8, p0, Lh73;->t:Lb13;

    .line 43
    .line 44
    iget-object v9, p0, Lh73;->u:Lb13;

    .line 45
    .line 46
    iget-boolean v5, p0, Lh73;->q:Z

    .line 47
    .line 48
    iget-object v6, p0, Lh73;->r:Lb13;

    .line 49
    .line 50
    iget-object v7, p0, Lh73;->s:Lb13;

    .line 51
    .line 52
    invoke-direct/range {v3 .. v9}, Lg73;-><init>(Llm0;ZLb13;Lb13;Lb13;Lb13;)V

    .line 53
    .line 54
    .line 55
    iput v2, p0, Lh73;->o:I

    .line 56
    .line 57
    invoke-virtual {p1, v3, p0}, Lgc0;->a(Lq81;Lvd0;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    sget-object p1, Lxe0;->n:Lxe0;

    .line 62
    .line 63
    if-ne p0, p1, :cond_2

    .line 64
    .line 65
    return-object p1

    .line 66
    :cond_2
    :goto_0
    sget-object p0, Lj15;->a:Lj15;

    .line 67
    .line 68
    return-object p0
.end method
