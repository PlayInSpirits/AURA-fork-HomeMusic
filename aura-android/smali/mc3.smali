.class public final synthetic Lmc3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public final synthetic n:Lnc3;

.field public final synthetic o:I


# direct methods
.method public synthetic constructor <init>(Lnc3;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmc3;->n:Lnc3;

    .line 5
    .line 6
    iput p2, p0, Lmc3;->o:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Lrg1;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    and-int/lit8 v0, p2, 0x3

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    move v0, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v2

    .line 19
    :goto_0
    and-int/2addr p2, v3

    .line 20
    invoke-virtual {p1, p2, v0}, Lrg1;->K(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_1

    .line 25
    .line 26
    iget-object p2, p0, Lmc3;->n:Lnc3;

    .line 27
    .line 28
    iget-object p2, p2, Lnc3;->b:Llc3;

    .line 29
    .line 30
    iget-object p2, p2, Llc3;->a:Lue1;

    .line 31
    .line 32
    iget p0, p0, Lmc3;->o:I

    .line 33
    .line 34
    invoke-virtual {p2, p0}, Lue1;->j(I)Lf12;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    iget v0, p2, Lf12;->a:I

    .line 39
    .line 40
    sub-int/2addr p0, v0

    .line 41
    iget-object p2, p2, Lf12;->c:Lwo0;

    .line 42
    .line 43
    iget-object p2, p2, Lwo0;->o:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p2, Lyf1;

    .line 46
    .line 47
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sget-object v1, Lrc3;->a:Lrc3;

    .line 56
    .line 57
    invoke-interface {p2, v1, p0, p1, v0}, Lyf1;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    invoke-virtual {p1}, Lrg1;->N()V

    .line 62
    .line 63
    .line 64
    :goto_1
    sget-object p0, Lj15;->a:Lj15;

    .line 65
    .line 66
    return-object p0
.end method
