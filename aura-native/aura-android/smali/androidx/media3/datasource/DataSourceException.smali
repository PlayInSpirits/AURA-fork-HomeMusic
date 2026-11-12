.class public Landroidx/media3/datasource/DataSourceException;
.super Ljava/io/IOException;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final n:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroidx/media3/datasource/DataSourceException;->n:I

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 9
    invoke-direct {p0, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 10
    iput p1, p0, Landroidx/media3/datasource/DataSourceException;->n:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/Exception;I)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 8
    iput p2, p0, Landroidx/media3/datasource/DataSourceException;->n:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Exception;I)V
    .locals 0

    .line 11
    invoke-direct {p0, p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 12
    iput p3, p0, Landroidx/media3/datasource/DataSourceException;->n:I

    return-void
.end method
