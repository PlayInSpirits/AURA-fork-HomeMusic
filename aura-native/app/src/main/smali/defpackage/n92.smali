.class public Ldefpackage/n92;
.super Ldefpackage/hd;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final c:Ldefpackage/om0;

.field public final d:Ldefpackage/rv2;

.field public final e:Ldefpackage/pa;

.field public final f:Ldefpackage/y41;

.field public final g:Ldefpackage/mm3;

.field public final h:Ldefpackage/k03;

.field public final i:Ldefpackage/k03;

.field public final j:Ldefpackage/k03;

.field public final k:Ldefpackage/k03;

.field public final l:Ldefpackage/k03;

.field public m:Ljava/lang/String;

.field public n:I


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Ldefpackage/hd;-><init>(Landroid/app/Application;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ldefpackage/k03;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p1, v0}, Ldefpackage/ad2;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Ldefpackage/n92;->h:Ldefpackage/k03;

    .line 11
    .line 12
    new-instance p1, Ldefpackage/k03;

    .line 13
    .line 14
    invoke-direct {p1, v0}, Ldefpackage/ad2;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance p1, Ldefpackage/k03;

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ldefpackage/ad2;-><init>(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Ldefpackage/n92;->i:Ldefpackage/k03;

    .line 23
    .line 24
    new-instance p1, Ldefpackage/k03;

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ldefpackage/ad2;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Ldefpackage/n92;->j:Ldefpackage/k03;

    .line 30
    .line 31
    new-instance p1, Ldefpackage/k03;

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ldefpackage/ad2;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Ldefpackage/n92;->k:Ldefpackage/k03;

    .line 37
    .line 38
    new-instance p1, Ldefpackage/k03;

    .line 39
    .line 40
    invoke-direct {p1, v0}, Ldefpackage/ad2;-><init>(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Ldefpackage/n92;->l:Ldefpackage/k03;

    .line 44
    .line 45
    invoke-static {}, Ldefpackage/ud3;->k()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, Ldefpackage/n92;->m:Ljava/lang/String;

    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    iput p1, p0, Ldefpackage/n92;->n:I

    .line 53
    .line 54
    new-instance p1, Ldefpackage/om0;

    .line 55
    .line 56
    const/4 v0, 0x5

    .line 57
    invoke-direct {p1, v0}, Ldefpackage/om0;-><init>(I)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Ldefpackage/n92;->c:Ldefpackage/om0;

    .line 61
    .line 62
    new-instance p1, Ldefpackage/rv2;

    .line 63
    .line 64
    const/16 v0, 0x1b

    .line 65
    .line 66
    invoke-direct {p1, v0}, Ldefpackage/rv2;-><init>(I)V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, Ldefpackage/n92;->d:Ldefpackage/rv2;

    .line 70
    .line 71
    new-instance p1, Ldefpackage/pa;

    .line 72
    .line 73
    const/16 v0, 0xc

    .line 74
    .line 75
    invoke-direct {p1, v0}, Ldefpackage/pa;-><init>(I)V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Ldefpackage/n92;->e:Ldefpackage/pa;

    .line 79
    .line 80
    new-instance p1, Ldefpackage/y41;

    .line 81
    .line 82
    const/16 v0, 0x12

    .line 83
    .line 84
    invoke-direct {p1, v0}, Ldefpackage/y41;-><init>(I)V

    .line 85
    .line 86
    .line 87
    iput-object p1, p0, Ldefpackage/n92;->f:Ldefpackage/y41;

    .line 88
    .line 89
    new-instance p1, Ldefpackage/mm3;

    .line 90
    .line 91
    invoke-direct {p1}, Ldefpackage/mm3;-><init>()V

    .line 92
    .line 93
    .line 94
    iput-object p1, p0, Ldefpackage/n92;->g:Ldefpackage/mm3;

    .line 95
    .line 96
    return-void
.end method


# virtual methods
.method public final c()Z
    .locals 3

    .line 1
    invoke-static {}, Ldefpackage/ud3;->k()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ldefpackage/n92;->m:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :cond_0
    iput-object v0, p0, Ldefpackage/n92;->m:Ljava/lang/String;

    .line 16
    .line 17
    iget v0, p0, Ldefpackage/n92;->n:I

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    add-int/2addr v0, v1

    .line 21
    iput v0, p0, Ldefpackage/n92;->n:I

    .line 22
    .line 23
    iget-object v0, p0, Ldefpackage/n92;->j:Ldefpackage/k03;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-virtual {v0, v2}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Ldefpackage/n92;->k:Ldefpackage/k03;

    .line 30
    .line 31
    invoke-virtual {p0, v2}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return v1
.end method

.method public final d(Ldefpackage/le1;)V
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/n92;->d:Ldefpackage/rv2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v0, "random"

    .line 7
    .line 8
    const/16 v1, 0xa

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-static {v0, v1, v2, v2}, Ldefpackage/rv2;->m(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)Ldefpackage/k03;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v1, p0, Ldefpackage/n92;->n:I

    .line 16
    .line 17
    new-instance v2, Ldefpackage/mp1;

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    iget-object v4, p0, Ldefpackage/n92;->j:Ldefpackage/k03;

    .line 21
    .line 22
    invoke-direct {v2, p0, v1, v4, v3}, Ldefpackage/mp1;-><init>(Ldefpackage/hd;ILdefpackage/k03;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1, v2}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final e(Ldefpackage/le1;)V
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/n92;->e:Ldefpackage/pa;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Ldefpackage/k03;

    .line 7
    .line 8
    invoke-direct {v1}, Ldefpackage/ad2;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static {v2}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Ldefpackage/pn4;->c()Ldefpackage/gp3;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Ldefpackage/gp3;->j()Lretrofit2/Call;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    new-instance v3, Ldefpackage/qr2;

    .line 25
    .line 26
    const/4 v4, 0x3

    .line 27
    invoke-direct {v3, v4, v0, v1}, Ldefpackage/qr2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v2, v3}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 31
    .line 32
    .line 33
    iget v0, p0, Ldefpackage/n92;->n:I

    .line 34
    .line 35
    new-instance v2, Ldefpackage/mp1;

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    iget-object v4, p0, Ldefpackage/n92;->k:Ldefpackage/k03;

    .line 39
    .line 40
    invoke-direct {v2, p0, v0, v4, v3}, Ldefpackage/mp1;-><init>(Ldefpackage/hd;ILdefpackage/k03;I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p1, v2}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final f(Ldefpackage/le1;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/16 v1, 0xa

    .line 3
    .line 4
    iget-object v2, p0, Ldefpackage/n92;->g:Ldefpackage/mm3;

    .line 5
    .line 6
    invoke-virtual {v2, v1, v0}, Ldefpackage/mm3;->d(IZ)Ldefpackage/k03;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object p0, p0, Ldefpackage/n92;->i:Ldefpackage/k03;

    .line 11
    .line 12
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    new-instance v1, Ldefpackage/g7;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v1, p0, v2}, Ldefpackage/g7;-><init>(Ldefpackage/k03;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1, v1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
