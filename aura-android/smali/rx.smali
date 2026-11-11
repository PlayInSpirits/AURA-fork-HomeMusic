.class public final synthetic Lrx;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lr02;


# instance fields
.field public final synthetic a:Lcx;


# direct methods
.method public synthetic constructor <init>(Lcx;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrx;->a:Lcx;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lev3;)Lk14;
    .locals 3

    .line 1
    iget-object v0, p1, Lev3;->e:Loz3;

    .line 2
    .line 3
    invoke-static {}, Lcx;->h()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Loz3;->a()Lnz3;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "public, only-if-cached, max-stale="

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lrx;->a:Lcx;

    .line 21
    .line 22
    iget p0, p0, Lcx;->a:I

    .line 23
    .line 24
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const-string v1, "Cache-Control"

    .line 32
    .line 33
    invoke-virtual {v0, v1, p0}, Lnz3;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string p0, "Pragma"

    .line 37
    .line 38
    iget-object v1, v0, Lnz3;->c:Lsl1;

    .line 39
    .line 40
    invoke-virtual {v1, p0}, Lsl1;->e(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance p0, Loz3;

    .line 44
    .line 45
    invoke-direct {p0, v0}, Loz3;-><init>(Lnz3;)V

    .line 46
    .line 47
    .line 48
    move-object v0, p0

    .line 49
    :cond_0
    invoke-virtual {p1, v0}, Lev3;->b(Loz3;)Lk14;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method
