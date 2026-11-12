.class public final Llm0;
.super Lad3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final H:Lxc5;


# instance fields
.field public final G:Lzd3;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ld60;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ld60;-><init>(IB)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lk2;

    .line 10
    .line 11
    const/16 v2, 0xc

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v1, v2, v3}, Lk2;-><init>(IB)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Lz;

    .line 18
    .line 19
    const/4 v3, 0x7

    .line 20
    invoke-direct {v2, v3, v0}, Lz;-><init>(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    invoke-static {v0, v1}, Ljz4;->j(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Lxc5;

    .line 28
    .line 29
    const/16 v3, 0x13

    .line 30
    .line 31
    invoke-direct {v0, v3, v2, v1}, Lxc5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Llm0;->H:Lxc5;

    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>(IFLgf1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lad3;-><init>(IF)V

    .line 2
    .line 3
    .line 4
    invoke-static {p3}, Luc5;->B(Ljava/lang/Object;)Lzd3;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Llm0;->G:Lzd3;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final n()I
    .locals 0

    .line 1
    iget-object p0, p0, Llm0;->G:Lzd3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzd3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lgf1;

    .line 8
    .line 9
    invoke-interface {p0}, Lgf1;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method
