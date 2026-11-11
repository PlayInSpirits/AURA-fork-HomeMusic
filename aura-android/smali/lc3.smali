.class public final Llc3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Lue1;


# direct methods
.method public constructor <init>(Lyf1;Lif1;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lue1;

    .line 5
    .line 6
    invoke-direct {v0}, Lue1;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lwo0;

    .line 10
    .line 11
    invoke-direct {v1, p2, p1}, Lwo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    if-ltz p3, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p1, "size should be >=0"

    .line 18
    .line 19
    invoke-static {p1}, Lfz1;->a(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    if-nez p3, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    new-instance p1, Lf12;

    .line 26
    .line 27
    iget p2, v0, Lue1;->o:I

    .line 28
    .line 29
    invoke-direct {p1, p2, p3, v1}, Lf12;-><init>(IILwo0;)V

    .line 30
    .line 31
    .line 32
    iget p2, v0, Lue1;->o:I

    .line 33
    .line 34
    add-int/2addr p2, p3

    .line 35
    iput p2, v0, Lue1;->o:I

    .line 36
    .line 37
    iget-object p2, v0, Lue1;->p:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p2, Lf13;

    .line 40
    .line 41
    invoke-virtual {p2, p1}, Lf13;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :goto_1
    iput-object v0, p0, Llc3;->a:Lue1;

    .line 45
    .line 46
    return-void
.end method
