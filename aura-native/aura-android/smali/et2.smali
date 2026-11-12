.class public final synthetic Let2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lit2;
.implements Lwc0;


# instance fields
.field public final synthetic n:Lj60;


# direct methods
.method public synthetic constructor <init>(Lj60;)V
    .locals 0

    .line 1
    iput-object p1, p0, Let2;->n:Lj60;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Let2;->n:Lj60;

    .line 2
    .line 3
    check-cast p1, Lal3;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lj60;->h(Lqi3;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public h(Ltn2;Lfr2;I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Let2;->n:Lj60;

    .line 2
    .line 3
    iget-object p0, p0, Lj60;->j:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    check-cast p0, Llu3;

    .line 9
    .line 10
    iget-object p3, p1, Ltn2;->e:Lpq;

    .line 11
    .line 12
    iget-object v0, p1, Ltn2;->k:Lkn2;

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Ltn2;->B(Lfr2;)Lfr2;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lkn2;->a()Lqi3;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-interface {p2}, Lqi3;->a()Lgn2;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object p2, p2, Lgn2;->a:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p3, v0, p1, p2, p0}, Lpq;->e(Lkn2;Lfr2;Ljava/lang/String;Llu3;)Lic2;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method
