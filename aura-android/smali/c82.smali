.class public final Lc82;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Lu44;

.field public final b:Lwc;

.field public final c:Lw03;


# direct methods
.method public constructor <init>(Lu44;Lwc;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc82;->a:Lu44;

    .line 5
    .line 6
    iput-object p2, p0, Lc82;->b:Lwc;

    .line 7
    .line 8
    sget-object p1, Lv54;->a:[J

    .line 9
    .line 10
    new-instance p1, Lw03;

    .line 11
    .line 12
    invoke-direct {p1}, Lw03;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lc82;->c:Lw03;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;)Lwf1;
    .locals 6

    .line 1
    iget-object v0, p0, Lc82;->c:Lw03;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lb82;

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    const/4 v3, 0x1

    .line 11
    const v4, 0x30c58c04

    .line 12
    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget v5, v1, Lb82;->b:I

    .line 17
    .line 18
    if-ne v5, p1, :cond_1

    .line 19
    .line 20
    iget-object p0, v1, Lb82;->c:Lr70;

    .line 21
    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    iget-object p0, v1, Lb82;->d:Lc82;

    .line 25
    .line 26
    new-instance p1, Lib;

    .line 27
    .line 28
    invoke-direct {p1, v2, p0, v1}, Lib;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance p0, Lr70;

    .line 32
    .line 33
    invoke-direct {p0, v4, v3, p1}, Lr70;-><init>(IZLsf1;)V

    .line 34
    .line 35
    .line 36
    iput-object p0, v1, Lb82;->c:Lr70;

    .line 37
    .line 38
    :cond_0
    return-object p0

    .line 39
    :cond_1
    new-instance v1, Lb82;

    .line 40
    .line 41
    invoke-direct {v1, p0, p1, p2}, Lb82;-><init>(Lc82;ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p2, v1}, Lw03;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, v1, Lb82;->c:Lr70;

    .line 48
    .line 49
    if-nez p1, :cond_2

    .line 50
    .line 51
    new-instance p1, Lib;

    .line 52
    .line 53
    invoke-direct {p1, v2, p0, v1}, Lib;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance p0, Lr70;

    .line 57
    .line 58
    invoke-direct {p0, v4, v3, p1}, Lr70;-><init>(IZLsf1;)V

    .line 59
    .line 60
    .line 61
    iput-object p0, v1, Lb82;->c:Lr70;

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_2
    return-object p1
.end method

.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    iget-object v1, p0, Lc82;->c:Lw03;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lb82;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_1
    iget-object p0, p0, Lc82;->b:Lwc;

    .line 17
    .line 18
    invoke-virtual {p0}, Lwc;->invoke()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Lnc3;

    .line 23
    .line 24
    iget-object p0, p0, Lnc3;->c:Lue1;

    .line 25
    .line 26
    iget-object p0, p0, Lue1;->p:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Lp03;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lp03;->d(Ljava/lang/Object;)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-ltz p1, :cond_2

    .line 35
    .line 36
    iget-object p0, p0, Lp03;->c:[I

    .line 37
    .line 38
    aget p0, p0, p1

    .line 39
    .line 40
    :cond_2
    return-object v0
.end method
