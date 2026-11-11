.class public final Ldx;
.super Lac1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic n:Lex;


# direct methods
.method public constructor <init>(Lej4;Lex;)V
    .locals 0

    .line 1
    iput-object p2, p0, Ldx;->n:Lex;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lac1;-><init>(Lej4;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldx;->n:Lex;

    .line 2
    .line 3
    iget-object v0, v0, Lex;->n:Lfr0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lfr0;->close()V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Lac1;->close()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
