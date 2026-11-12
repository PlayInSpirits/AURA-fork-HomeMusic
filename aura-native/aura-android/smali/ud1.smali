.class public final Lud1;
.super Lq42;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:Lrd1;

.field public final synthetic o:Lkc1;

.field public final synthetic p:La23;


# direct methods
.method public constructor <init>(Lrd1;Lkc1;La23;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lud1;->n:Lrd1;

    .line 2
    .line 3
    iput-object p2, p0, Lud1;->o:Lkc1;

    .line 4
    .line 5
    iput-object p3, p0, Lud1;->p:La23;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lq42;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, Lba2;

    .line 2
    .line 3
    iget-object v0, p0, Lud1;->n:Lrd1;

    .line 4
    .line 5
    iget-object v1, v0, Lrd1;->g:Ljava/util/ArrayList;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    iget-object v3, p0, Lud1;->o:Lkc1;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    move v5, v2

    .line 24
    :cond_1
    if-ge v5, v4, :cond_2

    .line 25
    .line 26
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    add-int/lit8 v5, v5, 0x1

    .line 31
    .line 32
    check-cast v6, Lkd3;

    .line 33
    .line 34
    iget-object v6, v6, Lkd3;->n:Ljava/lang/Object;

    .line 35
    .line 36
    iget-object v7, v3, Lkc1;->L:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v6, v7}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-eqz v6, :cond_1

    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    :cond_2
    :goto_0
    if-eqz p1, :cond_3

    .line 46
    .line 47
    if-nez v2, :cond_3

    .line 48
    .line 49
    invoke-virtual {v3}, Lkc1;->v()Lle1;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Lle1;->e()V

    .line 54
    .line 55
    .line 56
    iget-object p1, p1, Lle1;->r:Lea2;

    .line 57
    .line 58
    iget-object v1, p1, Lea2;->h:Lr92;

    .line 59
    .line 60
    sget-object v2, Lr92;->p:Lr92;

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-ltz v1, :cond_3

    .line 67
    .line 68
    iget-object v0, v0, Lrd1;->i:Lir0;

    .line 69
    .line 70
    iget-object p0, p0, Lud1;->p:La23;

    .line 71
    .line 72
    invoke-virtual {v0, p0}, Lir0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, Laa2;

    .line 77
    .line 78
    invoke-virtual {p1, p0}, Lea2;->a(Laa2;)V

    .line 79
    .line 80
    .line 81
    :cond_3
    sget-object p0, Lj15;->a:Lj15;

    .line 82
    .line 83
    return-object p0
.end method
