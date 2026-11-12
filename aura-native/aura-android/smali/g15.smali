.class public final Lg15;
.super Lep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lyf1;


# instance fields
.field public o:I

.field public synthetic p:Ljava/lang/Throwable;

.field public synthetic q:J


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lq81;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Throwable;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    check-cast p4, Lvd0;

    .line 12
    .line 13
    new-instance p3, Lg15;

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    invoke-direct {p3, v0, p4}, Lep4;-><init>(ILvd0;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p3, Lg15;->p:Ljava/lang/Throwable;

    .line 20
    .line 21
    iput-wide p0, p3, Lg15;->q:J

    .line 22
    .line 23
    sget-object p0, Lj15;->a:Lj15;

    .line 24
    .line 25
    invoke-virtual {p3, p0}, Lg15;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lg15;->o:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_1
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lg15;->p:Ljava/lang/Throwable;

    .line 23
    .line 24
    iget-wide v2, p0, Lg15;->q:J

    .line 25
    .line 26
    invoke-static {}, Lcx;->f()Lcx;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget-object v4, Li15;->a:Ljava/lang/String;

    .line 31
    .line 32
    const-string v5, "Cannot check for unfinished work"

    .line 33
    .line 34
    invoke-virtual {v0, v4, v5, p1}, Lcx;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    const-wide/16 v4, 0x7530

    .line 38
    .line 39
    mul-long/2addr v2, v4

    .line 40
    sget-wide v4, Li15;->b:J

    .line 41
    .line 42
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide v2

    .line 46
    iput v1, p0, Lg15;->o:I

    .line 47
    .line 48
    invoke-static {v2, v3, p0}, Lau0;->j(JLwd0;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    sget-object p1, Lxe0;->n:Lxe0;

    .line 53
    .line 54
    if-ne p0, p1, :cond_2

    .line 55
    .line 56
    return-object p1

    .line 57
    :cond_2
    :goto_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 58
    .line 59
    return-object p0
.end method
