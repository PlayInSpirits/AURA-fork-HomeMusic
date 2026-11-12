.class public final Lf73;
.super Lep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public o:I

.field public final synthetic p:I

.field public final synthetic q:I

.field public final synthetic r:Llm0;

.field public final synthetic s:Lb13;


# direct methods
.method public constructor <init>(IILlm0;Lb13;Lvd0;)V
    .locals 0

    .line 1
    iput p1, p0, Lf73;->p:I

    .line 2
    .line 3
    iput p2, p0, Lf73;->q:I

    .line 4
    .line 5
    iput-object p3, p0, Lf73;->r:Llm0;

    .line 6
    .line 7
    iput-object p4, p0, Lf73;->s:Lb13;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lep4;-><init>(ILvd0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvd0;)Lvd0;
    .locals 6

    .line 1
    new-instance v0, Lf73;

    .line 2
    .line 3
    iget-object v3, p0, Lf73;->r:Llm0;

    .line 4
    .line 5
    iget-object v4, p0, Lf73;->s:Lb13;

    .line 6
    .line 7
    iget v1, p0, Lf73;->p:I

    .line 8
    .line 9
    iget v2, p0, Lf73;->q:I

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lf73;-><init>(IILlm0;Lb13;Lvd0;)V

    .line 13
    .line 14
    .line 15
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
    invoke-virtual {p0, p1, p2}, Lf73;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lf73;

    .line 10
    .line 11
    sget-object p1, Lj15;->a:Lj15;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lf73;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lf73;->o:I

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
    iget-object p1, p0, Lf73;->s:Lb13;

    .line 23
    .line 24
    invoke-interface {p1}, Lkl4;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_2

    .line 35
    .line 36
    iget p1, p0, Lf73;->p:I

    .line 37
    .line 38
    if-ltz p1, :cond_2

    .line 39
    .line 40
    iget v0, p0, Lf73;->q:I

    .line 41
    .line 42
    if-ge p1, v0, :cond_2

    .line 43
    .line 44
    iget-object v0, p0, Lf73;->r:Llm0;

    .line 45
    .line 46
    iget-object v3, v0, Lad3;->s:Ldp0;

    .line 47
    .line 48
    invoke-virtual {v3}, Ldp0;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Ljava/lang/Number;

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eq p1, v3, :cond_2

    .line 59
    .line 60
    const/16 v3, 0x12c

    .line 61
    .line 62
    const/4 v4, 0x6

    .line 63
    invoke-static {v3, v1, v4}, Lau0;->T(ILry0;I)Lyy4;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iput v2, p0, Lf73;->o:I

    .line 68
    .line 69
    const/4 v2, 0x2

    .line 70
    invoke-static {v0, p1, v1, p0, v2}, Lad3;->g(Llm0;ILyy4;Lep4;I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    sget-object p1, Lxe0;->n:Lxe0;

    .line 75
    .line 76
    if-ne p0, p1, :cond_2

    .line 77
    .line 78
    return-object p1

    .line 79
    :cond_2
    :goto_0
    sget-object p0, Lj15;->a:Lj15;

    .line 80
    .line 81
    return-object p0
.end method
